package oldexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    System.out.println(checkNums(list));
    System.out.println(checkNums2(list));
    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

  }

  public static boolean checkNums(ArrayList<Integer> list) {
    boolean check = false;
    ArrayList<Integer> numContain = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    if (list.containsAll(numContain)) {
      check = true;
    }
    return check;
  }

  public static String checkNums2(ArrayList<Integer> list) {
    ArrayList<Integer> numContain = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    if (list.containsAll(numContain)) {
      return "True";
    }
    return "False";
  }



}