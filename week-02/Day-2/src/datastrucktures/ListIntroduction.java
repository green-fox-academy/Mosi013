package datastrucktures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction {
  /*
  * We are going to play with lists. Feel free to use the built-in methods where possible.

Create an empty list which will contain names (strings)
Print out the number of elements in the list
Add William to the list
Print out whether the list is empty or not
Add John to the list
Add Amanda to the list
Print out the number of elements in the list
Print out the 3rd element
Iterate through the list and print out each name
William
John
Amanda
Iterate through the list and print
1. William
2. John
3. Amanda
Remove the 2nd element
Iterate through the list in a reversed order and print out each name
Amanda
William
Remove all elements*/

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    System.out.println(names);
    System.out.println("-");
    names.add("William");
    System.out.println(names.size());
    System.out.println("--");
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println("---");
    System.out.println(names.get(2));
    System.out.println("----");
    for (String name : names){
      System.out.println(name);
    }
    System.out.println("-----");
    names.remove(1);
    for (int i = names.size() -1; i >= 0; i--) {
      System.out.println(names.get(i));
    }
    System.out.println("-----------");
    names.clear();
  }
}
