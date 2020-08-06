import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import katas.anagram.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {
  Anagram anagramChecker;

  @BeforeEach
  void setup() {
    anagramChecker = new Anagram();
  }

  @Test
  void isAnagramReturnsFalseIfTheFirstWordIsEmpty() {
    assertFalse(anagramChecker.isAnagram("", "dog"));
  }

  @Test
  public void shouldReturnTrueIfStringsAreAnagrams(){
    String str1 = "dog";
    String str2 = "god";
    Anagram ang = new Anagram();
    assertTrue(ang.isAnagram(str1,str2));
  }
}