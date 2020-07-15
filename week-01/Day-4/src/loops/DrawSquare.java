package loops;

import java.util.Scanner;

public class DrawSquare {
  // Write a program that reads a number from the standard input, then draws a
  // square like this:
  //
  //
  // %%%%%%
  // %    %
  // %    %
  // %    %
  // %    %
  // %%%%%%
  //
  // The square should have as many lines as the number was
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number");
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      if (i == 0 || i == (num - 1)) {
        for (int j = 0; j < num; j++) {
          System.out.print("%");
        }
      } else {
        System.out.print("%");
        for (int k = 0; k < (num - 2); k++) {
          System.out.print(" ");
        }
        System.out.print("%");
      }
      System.out.println("");
    }
  }
}