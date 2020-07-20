package functions.hardones;

import java.util.ArrayList;

public class PalindromeBuilder {
  /*Create a function named create palindrome following your current language's style guide.
  It should take a string, create a palindrome from it and then return it.*/

  public static void main(String[] args) {
    System.out.println(palindrome("one"));
  }

  public static String palindrome(String word)
  {
    for (int i = word.length() - 1; i >= 0; i--) {
      word += word.charAt(i);
    }
    return word;
  }
}

