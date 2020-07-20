package datastrucktures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
  /*We are going to represent our expenses in a list containing integers.

Create a list with the following items.
500, 1000, 1250, 175, 800 and 120
Create an application which solves the following problems.
How much did we spend?
Which was our greatest expense?
Which was our cheapest spending?
What was the average amount of our spendings?*/
  public static void main(String[] args) {
    ArrayList<Integer> expences = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

    System.out.println("How much did we spend? ");
    System.out.println(sumAll(expences));

    System.out.println("Which was our greatest expense?");
    System.out.println(greatestExpense(expences));

    System.out.println("Which was our cheapest spending?");
    System.out.println(cheapestSpending(expences));

    System.out.println("What was the average amount of our spendings?");
    System.out.println(average(expences));
  }

  public static int sumAll(ArrayList<Integer> input) {
    int sum = 0;
    for (int a : input) {
      sum += a;
    }
    return sum;
  }

  public static int greatestExpense(ArrayList<Integer> input) {
    ArrayList<Integer> holder = new ArrayList<>(input);
    Collections.sort(holder);
    return holder.get(holder.size() - 1);
  }

  public static int cheapestSpending(ArrayList<Integer> input) {
    ArrayList<Integer> holder = new ArrayList<>(input);
    Collections.sort(holder);
    return holder.get(0);
  }

  public static int average(ArrayList<Integer> input) {
    int sum = 0;
    for (int a : input) {
      sum += a;
    }
    int average = sum / input.size();
    return average;
  }
}