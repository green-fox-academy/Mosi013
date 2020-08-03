package sharpie;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import org.junit.jupiter.api.Test;

class SharpieTest {
  Sharpie sharpie;
  SharpieSet sharpieSet;

  @Test
  void returnDefaultInkAmount() {
    sharpie = new Sharpie("Blue", 30f);
    assertEquals(100, sharpie.inkAmount, 0f);
  }

  @Test
  void ReturnDefaultColor() {
    sharpie = new Sharpie("Pink", 10f);
    assertEquals("Pink", sharpie.color);
  }

  @Test
  void ReturnDefaultWidth() {
    sharpie = new Sharpie("Blue", 30f);
    assertEquals(30f, sharpie.width, 0.0f);
  }

  @Test
  void ReturnInkAmountAfterUsing() {
    sharpie = new Sharpie("Blue", 30f);
    for (int i = 0; i < 10; i++) {
      sharpie.use();
    }
    assertEquals(90, sharpie.inkAmount, 0.0f);
  }

}