package loops;

import java.util.Scanner;

public class DrawDiamond {
  // Write a program that reads a number from the standard input, then draws a
  // diamond like this:
  //
  //
  //    *
  //   ***
  //  *****
  // *******
  //  *****
  //   ***
  //    *
  //
  // The diamond should have as many lines as the number was
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int num = sc.nextInt();

    int space = num / 2 - 1;
    int star = 1;

    if (num % 2 != 0) {
      space = num / 2;
    }

    for (int i = 0; i < num / 2; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < star; k++) {
        System.out.print("*");
      }
      space--;
      star += 2;
      System.out.println("");
    }

    if (num % 2 != 0) {
      for (int m = 0; m < num; m++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    space++;
    star -= 2;

    for (int i = 0; i < num / 2; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < star; k++) {
        System.out.print("*");
      }
      space++;
      star -= 2;
      System.out.println("");
    }


  }
}