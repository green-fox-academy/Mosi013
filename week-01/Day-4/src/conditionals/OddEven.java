package conditionals;

import java.util.Scanner;

public class OddEven {
  // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number");
    int num = sc.nextInt();

    if (num % 2 == 0){
      System.out.println("It's even");
    }else {
      System.out.println("It's odd");
    }
  }
}
