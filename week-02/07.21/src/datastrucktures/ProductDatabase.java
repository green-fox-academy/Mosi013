package datastrucktures;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
  /*We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.

Create a map with the following key-value pairs.

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which solves the following problems.

How much is the fish?
What is the most expensive product?
What is the average price?
How many products' price is below 300?
Is there anything we can buy for exactly 125?
What is the cheapest product?*/
  public static void main(String[] args) {
    Map<String,Integer> shoppingList = new HashMap<>();
    shoppingList.put("Eggs", 200);
    shoppingList.put("Milk", 200);
    shoppingList.put("Fish", 400);
    shoppingList.put("Apples", 150);
    shoppingList.put("Bread", 50);
    shoppingList.put("Chicken", 550);

    System.out.println("How much is the fish?");


    System.out.println("What is the most expensive product?");


    System.out.println("What is the average price?");


    System.out.println("How many products' price is below 300?");


    System.out.println("Is there anything we can buy for exactly 125?");



  }



}
