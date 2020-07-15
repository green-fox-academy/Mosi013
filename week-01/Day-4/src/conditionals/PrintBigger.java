package conditionals;

import java.util.Scanner;

public class PrintBigger {
  // Write a program that asks for two numbers and prints the bigger one
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number");
    int num = sc.nextInt();
    System.out.println("Give me another number");
    int num2 = sc.nextInt();

    if (num > num2){
      System.out.println(num);
    } else if (num < num2){
      System.out.println(num2);
    } else {
      System.out.println("They are same");
    }
  }
}
