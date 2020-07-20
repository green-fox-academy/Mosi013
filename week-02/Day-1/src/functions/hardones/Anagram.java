package functions.hardones;

import java.util.Arrays;

public class Anagram {
  /*Create a function named is anagram following your current language's style guide.
  It should take two strings and return a boolean value
  depending on whether its an anagram or not.*/
  public static void main(String[] args) {
    System.out.println(anagram("dog", "goda"));
  }

  public static boolean anagram(String wordOne, String wordTwo) {
    char[] one = wordOne.toCharArray();
    char[] two = wordTwo.toCharArray();
    Arrays.sort(one);
    Arrays.sort(two);
    String firstWord = new String(one);
    String secondWord = new String(two);

    if (firstWord.equals(secondWord)){
      return true;
    } else {
      return false;
    }
  }
}
