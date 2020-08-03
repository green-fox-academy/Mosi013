import java.util.List;

public class Dojo {
  public static void main(String[] args) {

  }

  public int getIndex(List<Integer> inputList, int inputValue) {
    int value = 0;
    for (int i : inputList) {
      if (i == inputValue) {
        value = inputValue;
      } else {
        value = -1;
      }
    }
    return value;
  }
}
