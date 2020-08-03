package sum;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SumTest {
Sum sum = new Sum();
  ArrayList<Integer> testNubers;
  int expectedSumResult;
  @Test
  void sumTestWithPositiveNums() {
    testNubers = new ArrayList<>(Arrays.asList(5,5,5,5));
    expectedSumResult = sum.sum(testNubers);
    assertEquals(20, expectedSumResult);
  }

  @Test
  void sumTestWithEmptyList(){
    testNubers = new ArrayList<>();
    expectedSumResult = sum.sum(testNubers);
    assertEquals(0, expectedSumResult);
  }

  @Test
  void sumTestWithOneElementInTheList(){
    testNubers = new ArrayList<>(Arrays.asList(4));
    expectedSumResult = sum.sum(testNubers);
    assertEquals(4, expectedSumResult);
  }

  @Test
  void sumTestWithMultipleElements(){
    testNubers = new ArrayList<>(Arrays.asList(-4,-4,4,4,1));
    expectedSumResult = sum.sum(testNubers);
    assertEquals(1, expectedSumResult);
  }

  @Test
  void sumTestWithNull(){
    testNubers = null;
    expectedSumResult = sum.sum(testNubers);
    assertEquals(04
        , expectedSumResult);
  }
}