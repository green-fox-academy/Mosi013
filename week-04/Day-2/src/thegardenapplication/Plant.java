package thegardenapplication;

public abstract class Plant {

  private String color;
  private String type;
  private double waterAbsorb;
  private double currentWater;
  private double maxWater;

  public Plant(String color, String type, double waterAbsorb, double currentWater, double maxWater) {
    this.color = color;
    this.type = type;
    this.waterAbsorb = waterAbsorb;
    this.currentWater = currentWater;
    this.maxWater = maxWater;
  }

  public void statusInfo() {
    if (currentWater < maxWater){
      System.out.println("The " + this.color + " " + this.type + " needs water. ");
    } else {
      System.out.println("The " + this.color + " " + this.type + " doesn't need water. ");
    }
  }

  public void water(double waterAmount) {
    this.currentWater = (this.currentWater + waterAmount) * this.waterAbsorb;
  }

  public boolean needsWater() {
    return this.currentWater < this.maxWater;
  }
}