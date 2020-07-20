package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {

// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`

  public static void main(String[] args) {
    int[] numbers = {3, 4, 5, 6, 7};

    System.out.println("Array before rev");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    System.out.println("--------");
    System.out.println("Array after rev");

    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - i - 1];
      numbers[numbers.length - 1 - i] = temp;


    }
    System.out.println(Arrays.toString(numbers));

    System.out.println("---------");
    System.out.println("Reverse back");


    ArrayList<Integer> rev = new ArrayList<>();

    for (int nums : numbers) {
      rev.add(nums);
    }

    Collections.reverse(rev); /*Arrays.asList(rev)*/


    System.out.print(rev);
  }
}
