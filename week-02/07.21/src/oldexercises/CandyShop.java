package oldexercises;

import java.util.ArrayList;

public class CandyShop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }

  public static ArrayList<Object> sweets(ArrayList<Object> list) {
    if (list.contains(2)) {
      list.set(list.indexOf(2), "Croissant");
    }
    if (list.contains(false)){
      list.set(list.indexOf(false), "Ice cream");
    }
    return list;
  }

}