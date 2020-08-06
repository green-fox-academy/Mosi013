package thegardenapplication;

public class Main {

  public static void main(String[] args) {

    Garden garden = new Garden();
    garden.status();
    garden.water(40);
    garden.status();
    garden.water(70);
    garden.status();
  }

}