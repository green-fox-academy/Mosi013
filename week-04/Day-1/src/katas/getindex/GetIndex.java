package katas.getindex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndex {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));


    System.out.println(getIndex(list, 2));
  }

  public static int getIndex(List<Integer> inputList, int inputValue) {
    int value = -1;
    for (int i : inputList) {
      if (i == inputValue) {
        value = inputValue;
      }
    }
    return value;
  }
}
