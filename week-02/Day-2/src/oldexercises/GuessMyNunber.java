package oldexercises;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNunber {
  /*Exercise
Write a program where the program chooses a number between 1 and 100.
The player is then asked to enter a guess.
If the player guesses wrong, then the program gives feedback and
ask to enter an other guess until the guess is correct.

Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)
Example
I've the number between 1-100. You have 5 lives.

> 20
Too high. You have 4 lives left.

> 10
Too low. You have 3 lives left.

> 15
Congratulations. You won!*/
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int lives = 5;
    boolean gameOver = false;

    System.out.println("Whats the range of numbers?");
    int range = sc.nextInt();
    int randomNumber = random.nextInt(range) + 1;

    while (!gameOver) {
      System.out.println("What the guess?");
      int input = sc.nextInt();
      if (lives == 1){
        System.out.println("Game Over Noob");
        gameOver = true;
      }else if (input > randomNumber) {
        lives--;
        System.out.println("Too high like you. You have " + lives + " lives left.");
      } else if (input < randomNumber){
        lives--;
        System.out.println("Too low like your phone battery. You have " + lives + " lives left.");
      } else {
        System.out.println("Congratulations. You won!");
        System.out.println("Number was: " + randomNumber);
        gameOver = true;
      }
    }
      gameOver = true;
    }
  }

