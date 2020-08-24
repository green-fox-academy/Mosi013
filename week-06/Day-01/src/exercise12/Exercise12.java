package exercise12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Print the name of the heaviest character (if the mass is unknown, ignore that character)
Print the average height of the male characters
Print the average height of the female characters
💪 Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
The result should be a Map<String, Map<String, Integer>>*/
public class Exercise12 {
  public static void main(String[] args) {
    heaviestCharacter("assets\\input.csv");
  }

  public static void heaviestCharacter(String filePath) {
    // Read content and store data in a list
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(Paths.get(filePath));
    } catch (NoSuchFileException e) {
      System.out.println("File doesn't exists");
      System.exit(-1);
    } catch (IOException e) {
      System.out.println("File is not readable");
      System.exit(-1);
    } catch (Exception e) {
      System.out.println("Something went wrong with the file");
      System.exit(-1);
    }
//    lines.stream()
//        .map(charachter -> charachter.replaceAll(",", ";"))
//        .map(charachter -> charachter.replaceAll("\\.", ";"))
//        .map(data -> data.split(";"))
//        .collect(Collectors.toMap(data -> data))
//        .entrySet()
//        .stream()
//        .filter(entry -> !(entry.getValue() == "mass"))
//        .filter(entry -> !(entry.getValue() == "unknown"))
//        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//        .limit(1);


    System.out.println();

  }

}
