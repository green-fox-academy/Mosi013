import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DojoTest {

  @org.junit.jupiter.api.Test
  void getIndexTest() {
    Dojo dojo = new Dojo();
    int value = 2;
    List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    assertEquals(2, dojo.getIndex(testList, value));
  }
}