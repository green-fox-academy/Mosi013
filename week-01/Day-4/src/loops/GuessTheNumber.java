package loops;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int random = (int) (Math.random() * 10);
    boolean win = false;

    System.out.println("Guess a number between 0 and 10");
      while (!win) {
        System.out.println("What is your guess?");
        int guess = sc.nextInt();
        if (random < guess) {
          System.out.println("The number is lower");
        } else if (random > guess) {
          System.out.println("The number is HIGHER");
        } else {
          System.out.println("You won!!! The number was " + random);
          win = true;
        }
      }
    }
  }

