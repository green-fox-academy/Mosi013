package loops;

import java.util.Scanner;

public class CountFromTo {

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Give a number");
    int num = sc.nextInt();
    System.out.println("Give me another number");
    int num2 = sc.nextInt();

    if (num >= num2) {
      System.out.println("The second number should be bigger");
    } else if (num == num2) {
      System.out.println("Give me 2 different numbers");
    } else {
      for (int i = num + 1; i < num2; i++) {
        System.out.println(i);
      }
    }
  }
}
