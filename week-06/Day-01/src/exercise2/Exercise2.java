package exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to get the squared value of the positive numbers from the following list:
public class Exercise2 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    List<Integer> squaresOfPositiveNumbers =
        numbers.stream()
            .filter(number -> number > 0)
            .map(number -> number * number)
            .sorted()
            .collect(Collectors.toList());
  }
}
