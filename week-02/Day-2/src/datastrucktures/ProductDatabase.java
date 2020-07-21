package datastrucktures;

import java.util.ArrayList;
import java.util.Collections;
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
    Map<String, Integer> dataBase = new HashMap<>();
    dataBase.put("Eggs", 200);
    dataBase.put("Milk", 200);
    dataBase.put("Fish", 400);
    dataBase.put("Apples", 150);
    dataBase.put("Bread", 50);
    dataBase.put("Chicken", 550);

    System.out.println("How much is the fish?");
    System.out.println(dataBase.get("Fish"));

    System.out.println("What is the most expensive product?");
    System.out.println(mostExpensiveProduct(dataBase));

    System.out.println("What is the average price?");
    System.out.println(avgPrize(dataBase));

    System.out.println("How many products' price is below 300?");
    System.out.println(below300(dataBase));

    System.out.println("Is there anything we can buy for exactly 125?");
    System.out.println(exactly(dataBase, 125));
  }

  public static ArrayList<String> mostExpensiveProduct(Map<String, Integer> map) {
    ArrayList<Integer> prize = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      prize.add(entry.getValue());
    }
    Collections.sort(prize);
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (prize.get(prize.size() - 1) == entry.getValue()) {
        name.add(entry.getKey());
      }
    }
    return name;
  }

  public static int avgPrize(Map<String, Integer> map) {
    int sum = 0;
    int avg;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      sum += entry.getValue();
    }
      avg = sum / map.size();
    return avg;
  }

  public static int below300 (Map<String, Integer> map){
    int below = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()){
      if (entry.getValue() < 300){
        below ++;
      }
    }
    return below;
  }

  public static boolean exactly (Map<String, Integer> map, int value){
    for (Map.Entry<String, Integer> entry : map.entrySet()){
      if (entry.getValue() == value){
        return true;
      }
    }
    return false;

  }
}
