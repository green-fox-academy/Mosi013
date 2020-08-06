package part3.flyable;

public class Helicopter extends Vehicle implements Flyable{

  public Helicopter(String name, boolean airVehicle, boolean landVehicle) {
    super(name, airVehicle, landVehicle);
  }

  @Override
  public void land() {
    System.out.println(name + " landing");
  }

  @Override
  public void fly() {
    System.out.println(name + " flying");
  }

  @Override
  public void takeOff() {
    System.out.println(name + " taking off");
  }
}
