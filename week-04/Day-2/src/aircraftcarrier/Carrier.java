package aircraftcarrier;


import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircraftList;
  private int initialAmmo;
  private int healthPoint;
  private int storedAmmo;

  public Carrier(int initialAmmo, int healthPoint) {
    this.initialAmmo = initialAmmo;
    this.healthPoint = healthPoint;
    this.aircraftList = new ArrayList<>();
    this.storedAmmo = this.initialAmmo;
  }

  public void add(Aircraft aircraft) {
    aircraftList.add(aircraft);
  }

  public void fill() throws OutOfAmmoException {
    if (this.initialAmmo == 0) {
      throw new OutOfAmmoException("Out Of Ammo");
    } else {
      for (Aircraft aircraft : aircraftList) {
        if (aircraft.isPriority()) {
          this.initialAmmo -= aircraft.refill(this.initialAmmo);
        }
      }
      for (Aircraft aircraft : aircraftList) {
        if (!aircraft.isPriority()) {
          this.initialAmmo -= aircraft.refill(this.initialAmmo);
        }
      }
    }
  }

  public void fight(Carrier enemyCarrier) {
    enemyCarrier.healthPoint -= this.getTotalDmg();
    if (enemyCarrier.healthPoint <= 0) {
      System.out.println("It's dead Jim");
    }
  }

  private int getTotalDmg() {
    int dmg = 0;
    for (Aircraft aircraft : aircraftList) {
      dmg += aircraft.currentAmmo * aircraft.baseDamage;
    }
    return dmg;
  }

  public String getStatus() {
    if (this.healthPoint <= 0) {
      return "It's dead Jim";
    }
    return "HP: " + this.healthPoint +
        " Aircraft count: " + aircraftList.size() +
        ", Ammo Storage: " + this.initialAmmo +
        ", Total damage: " + getTotalDmg()
        + "\n" + "Aircrafts: \n" + getInfo();

  }

  private String getInfo() {
    String info = "";
    for (Aircraft aircraft : aircraftList) {
      info += aircraft.getStatus() + "\n";
    }
    return info;
  }
}
