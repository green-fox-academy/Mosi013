package userinput;


import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it
    Scanner sc = new Scanner(System.in);

    System.out.println("Give a distance in miles");
    double mile = sc.nextDouble() / 0.62137;
    System.out.println("It's " + mile + " km");

  }
}