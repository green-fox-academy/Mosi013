package apples;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ApplesTest {

  @Test
  public void getAppleTest(){
    Apples apple = new Apples();
    String expected = "Banana";
    String returnString = apple.getApple();
    assertEquals(expected, returnString);
  }

}