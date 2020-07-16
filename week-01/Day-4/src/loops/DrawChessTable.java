package loops;


import java.util.Scanner;

public class DrawChessTable {
  // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me the number of lines ");
    int lines = input.nextInt();

    for (int i = 1; i <= lines; i++) {
      if (i % 2 == 0) {
        System.out.print("  ");
      }
      System.out.print("% % % %");
      System.out.println("");
    }
  }
}
