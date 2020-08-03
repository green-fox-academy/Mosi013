package cowsnbulls;

import java.util.Scanner;

public class CowsNBulls {
  /*Example: If the number to be found is "7624" and the player types "7296", the result is: "1 cow, 2 bull".

The CAB object should have a random 4 digit number, which is the goal to guess.
The CAB object should have a state where the game state is stored (playing, finished).
The CAB object should have a counter where it counts the guesses.
The CAB object should have a guess method, which returns a string of the guess result
All methods, including constructor should be tested*/
  public static void main(String[] args) {

    boolean isFinished;
    System.out.println("Let's play");
    System.out.println("Guess a number between 1000 and 9999");
    userGuess();
  }

  public static String intToStringConverter() {
    String num = "";
    int random = (int) (Math.random() * 8999) + 1000;
    num += Integer.toString(random);
    return num;
  }

  public static String userGuess() {
    Scanner sc = new Scanner(System.in);
    String playerGuess = sc.nextLine();
    return playerGuess;
  }

  public void compareTheTwoNumbers(String aimString, String userGuess){
    int cowNumber = 0;
    int bullNumber = 0;

    for (int i = 0; i <aimString.length() ; i++) {
      if (aimString.charAt(i) == userGuess.charAt(i)){
        cowNumber++;
      }else if (userGuess.indexOf(aimString.charAt(i)) != -1){
        bullNumber++;
      }
    }
  }


}
