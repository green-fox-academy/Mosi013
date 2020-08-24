package exercise9;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Write a Stream Expression to find the frequency of characters in a given string!
public class Exercise9 {
  public static void main(String[] args) {
    String example = "alma";
    Map<String,Long> frequencyOfCharacters =
        Arrays.stream(example.split(""))
          .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    frequencyOfCharacters.forEach((k,v) -> System.out.println(k + " - " + v));
  }
}
