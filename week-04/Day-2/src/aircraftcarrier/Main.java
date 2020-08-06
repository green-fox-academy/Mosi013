package aircraftcarrier;

public class Main {
  public static void main(String[] args) throws OutOfAmmoException {

    Carrier carr1 = new Carrier(15, 2000);
    Carrier carr2 = new Carrier(200, 100);

    Aircraft f16 = new F16();
    Aircraft f35 = new F35();
    Aircraft f352 = new F35();
    carr1.add(f16);
    carr1.add(f35);
    carr1.add(f352);
    carr1.fill();

    carr1.fight(carr2);
    System.out.println(carr1.getStatus());
  }
}