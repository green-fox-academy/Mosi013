package loops;

import java.util.Scanner;

public class DrawPyramid {

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a number");

    int num = sc.nextInt();
    int spaceCounter = num - 1;
    int stars = 1;

    for (int i = 0; i < num; i++) {
      for (int j = 0; j <= spaceCounter; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < stars; k++) {
        System.out.print("*");
      }
      stars += 2;
      spaceCounter--;

      System.out.println("");
    }
  }
}
