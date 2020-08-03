package sum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
  public static int sum(ArrayList<Integer> listWithNumbers) {
    int summa = 0;
    if (listWithNumbers == null){
      return 0;
    }
    for (int i = 0; i < listWithNumbers.size(); i++) {
      summa += listWithNumbers.get(i);
    }
    return summa;
  }
}
