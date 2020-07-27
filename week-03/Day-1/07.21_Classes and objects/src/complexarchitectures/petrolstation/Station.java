package complexarchitectures.petrolstation;

public class Station {
  public int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car){
    //decreases the gasAmount by
    // the capacity of the car and
    // increases the cars gasAmount
    this.gasAmount -= car.capacity;
    System.out.println(gasAmount);
  }
}
