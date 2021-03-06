package extension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (a < b && c < b) {
      return b;
    } else {
      return c;
    }
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 1) {
      return (double) pool.get((pool.size() - 1) / 2);
    }
    return (double) ((pool.get(pool.size() / 2 - 1)) + (pool.get(pool.size() / 2))) / 2;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String inputWord) {
    String word = inputWord;
    int wordLength = word.length();
    for (int i = 0; i < wordLength; i++) {
      char c = word.charAt(i);
      if (isVowel(c)) {
        word = String.join(c + "v" + c, word.split("" + c));
        i += 2;
        wordLength += 2;
      }
    }
    return word;
  }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed