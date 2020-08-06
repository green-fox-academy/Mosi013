package katas.anagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

  public static boolean isAnagram(String input1, String input2) {
    List<Character> inputCharactersArrayOne = new ArrayList<>();
    List<Character> inputCharactersArrayTwo = new ArrayList<>();
    boolean isAnagram = false;

    for (char c : input1.toCharArray()) {
      inputCharactersArrayOne.add(c);
    }

    for (char c : input2.toCharArray()) {
      inputCharactersArrayTwo.add(c);
    }

    Collections.sort(inputCharactersArrayOne);
    Collections.sort(inputCharactersArrayTwo);

    if (input1.length() != input2.length()) {
      return false;
    } else {
      inputCharactersArrayOne.equals(inputCharactersArrayTwo);
      isAnagram = true;
    }

    return isAnagram;
  }
}


