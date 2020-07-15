package userinput;


import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    Scanner sc = new Scanner(System.in);

    System.out.println("Give me your number of chickens:");
    int chicken = sc.nextInt();
    System.out.println("Give me your number of pigs:");
    int pigs = sc.nextInt();

    int chickensLegs = chicken * 2;
    int pigsLegs = pigs * 4;
    int allLegs = chickensLegs + pigsLegs;

    System.out.println("You have " + allLegs + " legs in the farm" );
  }
}