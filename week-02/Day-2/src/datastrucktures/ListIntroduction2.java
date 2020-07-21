package datastrucktures;

import java.util.ArrayList;

public class ListIntroduction2 {
  /*Create a list ('List A') which contains the following values
Apple, Avocado, Blueberries, Durian, Lychee
Create a new list ('List B') with the values of List A
Print out whether List A contains Durian or not
Remove Durian from List B
Add Kiwifruit to List A after the 4th element
Compare the size of List A and List B
Get the index of Avocado from List A
Get the index of Durian from List B
Add Passion Fruit and Pomelo to List B in a single statement
Print out the 3rd element from List A*/
  public static void main(String[] args) {
    ArrayList<String> ListA = new ArrayList<>();
    String[] a = {"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};
    for (String words : a){
      ListA.add(words);
    }
    ArrayList<String> ListB = new ArrayList<>();
    for (String words : ListA){
      ListB.add(words);
    }
    ListB.remove("Durian");
    ListA.add(3, "Kiwifruit");

    System.out.println(ListA.equals(ListB));
    System.out.println(ListB.indexOf("Durian"));
    ListB.add("Passion Fruit");
    ListB.add("Pomelo");
    System.out.println(ListA.get(2));

    for (int i = 0; i <ListA.size() ; i++) {
      System.out.println(ListA.get(i));
    }
    System.out.println("---------");
    for (int i = 0; i <ListB.size() ; i++) {
      System.out.println(ListB.get(i));
    }
  }
}
