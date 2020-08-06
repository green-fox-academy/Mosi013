package part3.flyable;

public abstract class Vehicle {
  String name;
  boolean airVehicle;
  boolean landVehicle;

  public Vehicle(String name, boolean airVehicle, boolean landVehicle) {
    this.name = name;
    this.airVehicle = airVehicle;
    this.landVehicle = landVehicle;
  }
}
