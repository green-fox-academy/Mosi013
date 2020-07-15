package variables;

import java.util.Scanner;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    Scanner sc = new Scanner(System.in);

    System.out.println("Give me the remaining hours: ");
    int hour = sc.nextInt();
    System.out.println("Give me the remaining minutes: ");
    int minute = sc.nextInt();
    System.out.println("Give me the remaining seconds: ");
    int sec = sc.nextInt();

    int remainingHours = 24 - hour - 1;
    int remainingMinutes = 60 - minute;
    int remainingSeconds = 60 - 1;
    int remainingDayInSec = (remainingHours * 60 * 60) + (remainingMinutes * 60) + remainingSeconds;


    System.out.println("Remaining seconds: " + remainingDayInSec);
  }
}