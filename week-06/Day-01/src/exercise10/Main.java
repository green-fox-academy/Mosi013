package exercise10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    //Write a Stream Expression to find the foxes with green color!
    List<Fox> foxes = foxList();
    List<Fox> foxesWithGreenColor =
        foxes.stream()
              .filter(fox -> fox.getColor() == "Green")
              .collect(Collectors.toList());
    System.out.println(foxesWithGreenColor.toString());
    //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    List<Fox>foxesWithGreenColorAndLessThenFIveYearsOld =
          foxes.stream()
                .filter(fox -> fox.getColor() == "Green" && fox.getAge() <= 5)
                .collect(Collectors.toList());
    System.out.println(foxesWithGreenColorAndLessThenFIveYearsOld.toString());
    //Write a Stream Expression to find the frequency of foxes by color!
    Map<String, Long> frequencyByColor =
        foxes.stream()
          .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));
      frequencyByColor.forEach((k,v) -> System.out.println(k + " - " + v));

  }

  public static List<Fox> foxList() {
    return Arrays.asList(
        new Fox("Mark", "Green", 25),
        new Fox("Aurél", "Green", 5),
        new Fox("Dániel", "Yellow", 3),
        new Fox("Kenji", "Silver", 26),
        new Fox("Dávid", "Silver", 24)
    );
  }
}
