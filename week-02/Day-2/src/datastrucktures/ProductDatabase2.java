package datastrucktures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
  /*
  * Create a map with the following key-value pairs.

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which solves the following problems.

Which products cost less than 201? (just the name)
Which products cost more than 150? (name + price)
*/

  public static void main(String[] args) {
    Map<String, Integer> dataBase = new HashMap<>();
    dataBase.put("Eggs", 200);
    dataBase.put("Milk", 200);
    dataBase.put("Fish", 400);
    dataBase.put("Apples", 150);
    dataBase.put("Bread", 50);
    dataBase.put("Chicken", 550);

    System.out.println("Which products cost less than 201?");
    System.out.println(lessThan201(dataBase));

    System.out.println("Which products cost more than 150?");
    System.out.println(moreThan150(dataBase));
  }

  public static ArrayList<String> lessThan201 (Map<String,Integer> map){
    ArrayList<String> less = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()){
      if (entry.getValue() <= 201){
        less.add(entry.getKey());
      }
    }
    Collections.sort(less);
    return less;
  }

  public static ArrayList<String> moreThan150 (Map<String, Integer> map){
    ArrayList<String> more = new ArrayList<>();
    for (Map.Entry<String,Integer> entry : map.entrySet()){
      if (entry.getValue() > 150){
        more.add(entry.getKey());
      }
    }
    Collections.sort(more);
    return more;
  }
}
