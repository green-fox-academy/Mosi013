package practice;

import java.util.Scanner;

public class DivideByZero {
  /*
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0*/

  public static void main(String[] args) {
    dividedByZero();
  }

  private static void dividedByZero() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give a number Summoner");
    try {
      int input = sc.nextInt();
      System.out.println(10 / input);
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    }
  }
}
