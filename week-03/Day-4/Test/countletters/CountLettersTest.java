package countletters;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

class CountLettersTest {

  CountLetters count = new CountLetters();

  @Test
  public void countLettersTest() {
    String word = "mosonyi";
    HashMap<Character, Integer> expectedDictionary = new HashMap<Character, Integer>();
    HashMap<Character, Integer> computedDictionary = new HashMap<>();
    expectedDictionary.put('m', 1);
    expectedDictionary.put('o', 2);
    expectedDictionary.put('s', 1);
    expectedDictionary.put('n', 1);
    expectedDictionary.put('y', 1);
    expectedDictionary.put('i', 1);
    computedDictionary.putAll(count.countLetters(word));
    assertEquals(expectedDictionary.keySet(), computedDictionary.keySet());
    for (char key: expectedDictionary.keySet()) {
      assertEquals(expectedDictionary.get(key), computedDictionary.get(key));
    }
  }

  @Test
  public void countLettersTest2() {
    String word = "blabla";
    HashMap<Character, Integer> expectedDictionary = new HashMap<Character, Integer>();
    HashMap<Character, Integer> computedDictionary = new HashMap<>();
    expectedDictionary.put('b', 2);
    expectedDictionary.put('l', 2);
    expectedDictionary.put('a', 2);
    computedDictionary.putAll(count.countLetters(word));
    assertEquals(expectedDictionary.keySet(), computedDictionary.keySet());
    for (char key: expectedDictionary.keySet()) {
      assertEquals(expectedDictionary.get(key), computedDictionary.get(key));
    }
  }
}
