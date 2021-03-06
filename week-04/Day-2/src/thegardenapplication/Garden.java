package thegardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> listOfPlants;

  public Garden() {
    listOfPlants = new ArrayList<>();
    Tree tree1 = new Tree( "purple");
    Tree tree2 = new Tree("orange");
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    listOfPlants.add(flower1);
    listOfPlants.add(flower2);
    listOfPlants.add(tree1);
    listOfPlants.add(tree2);
  }

  public void printStatus() {
    for (Plant plant : listOfPlants) {
      plant.statusInfo();
    }
  }

  public void water(double waterAmount) {
    System.out.println("Watering with: " + (int)waterAmount);
    waterAmount = waterAmount / HowManyPlantsNeedsWater();
    for (Plant plant: listOfPlants) {
      if (plant.needsWater()) {
        plant.water(waterAmount);
      }
    }
  }

  public int HowManyPlantsNeedsWater() {
    int counter = 0;
    for (Plant plant: listOfPlants ) {
      if (plant.needsWater()) {
        counter++;
      }
    }
    return counter;
  }
}