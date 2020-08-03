import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import katas.getindex.GetIndex;

class GetIndexTest {

  @org.junit.jupiter.api.Test
  void getIndexTest() {
    GetIndex index = new GetIndex();
    int value = 2;
    List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    assertEquals(1, index.getIndex(testList, value));
  }
}