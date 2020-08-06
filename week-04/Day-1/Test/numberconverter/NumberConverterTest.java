package numberconverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberConverterTest {

  @Test
  void convertTest() {
    NumberConverter numberConverter = new NumberConverter();
    int num = 900061311;
    assertEquals("nine hundred million sixty one thousand three hundred eleven", numberConverter.convert(num));
  }
}