package functions.hardones;

import java.util.ArrayList;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array
    //  Example:
    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61, 9}));
    //  should print: '[]'
  }

  public static ArrayList<Integer> subInt(int num, int[] SearchArray) {
    ArrayList<Integer> indices = new ArrayList<>();
    for (int i = 0; i < SearchArray.length; i++) {
      if (Integer.toString(SearchArray[i]).contains(Integer.toString(num))) {
        indices.add(i);
      }
    }
    return indices;
  }
}