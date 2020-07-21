package oldexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
    System.out.println(containsSeven(arrayList, 7));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
    System.out.println(containsSeven2(arrayList, 2));
  }

  public static String containsSeven(ArrayList<Integer> list, int number) {
    if (list.contains(number)) {
      return "Horray";
    } else {
      return "Nooooo";
    }
  }

  public static String containsSeven2(ArrayList<Integer> list, int num) {
    for (int i : list) {
      if (i == num) {
        return "Horray";
      }
    }
    return "nooooo";
  }
}