package datastrucktures;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  /*Represent the following products with their prices

Product	Amount
Milk	1.07
Rice	1.59
Eggs	3.14
Cheese	12.60
Chicken Breasts	9.40
Apples	2.31
Tomato	2.58
Potato	1.75
Onion	1.10
Represent Bob's shopping list

Product	Amount
Milk	3
Rice	2
Eggs	2
Cheese	1
Chicken Breasts	4
Apples	1
Tomato	2
Potato	1
Represent Alice's shopping list

Product	Amount
Rice	1
Eggs	5
Chicken Breasts	2
Apples	1
Tomato	10
Create an application which solves the following problems.

How much does Bob pay?
How much does Alice pay?
Who buys more Rice?
Who buys more Potato?
Who buys more different products?
Who buys more products? (piece)*/
  public static void main(String[] args) {
    HashMap<String, Double> products = new HashMap<>();
    products.put("Milk", 1.07);
    products.put("Rice", 1.59);
    products.put("Eggs", 3.14);
    products.put("Cheese", 12.60);
    products.put("Chicken Breasts", 9.40);
    products.put("Apples", 2.31);
    products.put("Tomato", 2.58);
    products.put("Potato", 1.75);
    products.put("Onion", 1.10);

    HashMap<String, Double> bobsShoppingList = new HashMap<>();
    bobsShoppingList.put("Milk", 3.);
    bobsShoppingList.put("Rice", 2.);
    bobsShoppingList.put("Eggs", 2.);
    bobsShoppingList.put("Cheese", 1.);
    bobsShoppingList.put("Chicken Breasts", 4.);
    bobsShoppingList.put("Apples", 1.);
    bobsShoppingList.put("Tomato", 2.);
    bobsShoppingList.put("Potato", 1.);

    HashMap<String, Double> alicesShoppingList = new HashMap<>();
    alicesShoppingList.put("Rice", 1.);
    alicesShoppingList.put("Eggs", 5.);
    alicesShoppingList.put("Chicken Breasts", 2.);
    alicesShoppingList.put("Apples", 1.);
    alicesShoppingList.put("Tomato", 10.);

    System.out.println("How much does Bob pay?");
    System.out.println(sumAll(products, bobsShoppingList));

    System.out.println("How much does Alice pay?");
    System.out.println(sumAll(products, alicesShoppingList));

    System.out.println("Who buys more Rice?");
    whoBuysMore(bobsShoppingList, alicesShoppingList, "Rice");

    System.out.println("Who buys more Potato?");
    whoBuysMore(bobsShoppingList, alicesShoppingList, "Potato");
  }

  public static double sumAll(HashMap<String, Double> productsList, HashMap<String, Double> shoppingList) {
    double sum = 0;
    for (Map.Entry<String, Double> products : shoppingList.entrySet()) {
      sum += (productsList.get(products.getKey()) * products.getValue());
    }
    return sum;
  }

  public static void whoBuysMore(HashMap<String, Double> shoppingList1, HashMap<String, Double> shoppingList2, String keyProduct) {
    if (shoppingList1.containsKey(keyProduct) && shoppingList2.containsKey(keyProduct)) {
      if (shoppingList1.get(keyProduct) > shoppingList2.get(keyProduct)) {
        System.out.println("The first person bought more.");
      } else if (shoppingList1.get(keyProduct) < shoppingList2.get(keyProduct)) {
        System.out.println("The second person bought more.");
      } else {
        System.out.println("The bought the same amount.");
      }
    } else {
      if (shoppingList1.containsKey(keyProduct)) {
        System.out.println("The first person bought more, because the second buyer didn't buy.");
      } else {
        System.out.println("The second person bought more, because the first buyer didn't buy.");
      }
    }
  }
}
