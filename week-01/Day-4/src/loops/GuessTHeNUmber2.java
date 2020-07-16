package loops;

import java.util.Scanner;

public class GuessTHeNUmber2 { public static void main(String[] args) {
    int computersNumber;
    int usersGuess;
    int guessCount;
    Scanner sc = new Scanner(System.in);
    computersNumber = (int)(10 * Math.random()) + 1;
    guessCount = 0;
    System.out.println();
    System.out.print("What is your first guess? ");
    while (true) {
      usersGuess = sc.nextInt();
      guessCount++;
      if (usersGuess == computersNumber) {
        System.out.println("You got it in " + guessCount
            + " guesses!  My number was " + computersNumber);
        break;
      }
      if (guessCount == 3) {
        System.out.println("You didn't get the number in 3 guesses.");
        System.out.println("You lose.  The number was " + computersNumber);
        break;
      }

      if (usersGuess < computersNumber)
        System.out.print("That's too low.  Try again: ");
      else if (usersGuess > computersNumber)
        System.out.print("That's too high.  Try again: ");
    }
    System.out.println();

  }
}
