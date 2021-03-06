package functions.hardones;

import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
  }

  public static String bubble(int[] array) {
    Arrays.sort(array);
    return Arrays.toString(array);
  }

  public static String advancedBubble(int[] array, boolean reverse) {
    if (reverse) {
      Arrays.sort(array);
      for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - 1 - i] = temp;
      }
    }
    return Arrays.toString(array);
  }
}
