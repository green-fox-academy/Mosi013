package variables;

import java.util.Scanner;

public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;

    Scanner sc = new Scanner(System.in);
    System.out.println("Give me your weight in kg");
    double scanner = sc.nextDouble();
    System.out.println("Give me your height in meter");
    double scanner2 = sc.nextDouble();
    // Print the Body mass index (BMI) based on these values
    System.out.println("Your Bmi is: " + scanner / (scanner2 * scanner2));
  }
}
