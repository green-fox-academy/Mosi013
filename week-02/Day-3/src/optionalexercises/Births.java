package optionalexercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  /*
    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any one of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.*/
  public static void main(String[] args) throws IOException {
    System.out.println(mostBirths("txt/biths.csv"));
  }

  private static List<Integer> mostBirths(String input) throws IOException {
    Path filePath = Paths.get(input);
    List<String> list;
    List<Integer> births = new ArrayList<>();
    Map<Integer, Integer> yearMap = new HashMap<>();
    list = Files.readAllLines(filePath);

    for (String birth : list) {
      births.add(Integer.parseInt(birth.split(";")[1].split("-")[0]));
    }
    for (int year : births) {
      if (!yearMap.containsKey(year)) {
        yearMap.put(year, +1);
      }


    }
    return births;
  }
}

