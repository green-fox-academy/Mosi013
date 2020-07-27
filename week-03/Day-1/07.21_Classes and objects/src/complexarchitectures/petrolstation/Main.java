package complexarchitectures.petrolstation;

public class Main {
  public static void main(String[] args) {
    Station station = new Station(5000);
    Car car = new Car();

    station.refill(car);
  }
}
