package userinput;

import java.util.Scanner;

public class AverageOfInput {
  // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Give me 5 integers!");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    int sum = a + b + c + d + e;
    double average = (double) sum / 5;

    System.out.println("Sum: " + sum + " Average: " + average);
  }
}
