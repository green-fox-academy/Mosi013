package aircraftcarrier;

public abstract class Aircraft {
  private int maxAmmo;
  protected int baseDamage;
  protected int currentAmmo;

  public Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = 0;
  }

  public int fight() {
    this.currentAmmo = 0;
    return damageDeal();
  }

  private int damageDeal() {
    int dmg = this.baseDamage * this.currentAmmo;
    return dmg;
  }

  public int refill(int refillingAmount) {
    int remainingAmmo = refillingAmount;
    if (ammoNeeded() == 0) {
      return refillingAmount;
    }

    if (ammoNeeded() >= refillingAmount) {
      currentAmmo += remainingAmmo;
      remainingAmmo = 0;
    } else {
      currentAmmo += ammoNeeded();
    }
    return currentAmmo;
  }

  private int ammoNeeded() {
    int ammoNeeded = this.maxAmmo - this.currentAmmo;
    return ammoNeeded;
  }

  public String getType(){
    return getClass().getSimpleName();
  }

  public String getStatus() {
    return "Type " + getType() +
        ", Ammo: " + currentAmmo +
        ", Base Damage: " + baseDamage +
        ", All Damage: " + totalDamage();
  }

  private int totalDamage(){
    int totalDmg = this.baseDamage * this.currentAmmo;
    return totalDmg;
  }

  public abstract boolean isPriority();
}