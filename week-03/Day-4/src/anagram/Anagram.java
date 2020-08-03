package anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(anagramSearcher("amla", "alma"));
  }
  public static boolean anagramSearcher(String input1, String input2){
    boolean isItAnagram;
    if (input1.length() != input2.length()){
      return false;
    }
    char[] inputOne = input1.toCharArray();
    char[] inputTwo = input2.toCharArray();
    Arrays.sort(inputOne);
    Arrays.sort(inputTwo);
    return Arrays.equals(inputOne, inputTwo);
  }
}
