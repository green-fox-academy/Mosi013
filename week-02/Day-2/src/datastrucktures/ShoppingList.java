package datastrucktures;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  /*We are going to represent a shopping list in a list containing strings.

Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list?*/
  public static void main(String[] args) {
    ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("Eggs", "Milk", "Fish", "Apples","Bread", "Chicken"));

    System.out.println("Do we have milk on the list?");
    System.out.println(shoppingList.contains("Milk"));
    System.out.println("Do we have bananas on the list?");
    System.out.println(shoppingList.contains("Bananas"));
  }

}
