package thegardenapplication;

public class Main {

  public static void main(String[] args) {

    Garden garden = new Garden();
    garden.printStatus();
    garden.water(40);
    garden.printStatus();
    garden.water(70);
    garden.printStatus();
  }

}