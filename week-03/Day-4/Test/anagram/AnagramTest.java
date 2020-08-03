package anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {
  Anagram anagram = new Anagram();
  String testOne = "alma";
  String testTwo = "amla";


  @Test
  void anagramTest(){
    assertEquals(true, anagram.anagramSearcher(testOne, testTwo));
  }
}