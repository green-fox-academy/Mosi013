package exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to concatenate a Character list to a string!
public class Exercise8 {
  public static void main(String[] args) {
    List<Character> chars = Arrays.asList('a', 'l', 'm', 'a');
    String concatenateAString =
        chars.stream()
        .map(c -> c.toString())
        .collect(Collectors.joining());
    System.out.println(concatenateAString);
  }
}
