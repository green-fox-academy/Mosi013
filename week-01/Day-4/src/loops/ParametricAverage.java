package loops;


import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    Scanner sc = new Scanner(System.in);
    System.out.println("How many integers do you want?");
    int givenIntegers = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < givenIntegers; i++) {
      System.out.println("Give me next number: ");
      int number = sc.nextInt();
      sum += number;
    }
    double average = (double) sum / givenIntegers;
    System.out.println("SUM: " + sum + " , " + "Avg: " + average);
  }
}