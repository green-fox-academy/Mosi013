package exercise11;

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

//Create a Stream expression which reads all text from this file,
// and prints the 100 most common words in descending order.
// Keep in mind that the text contains punctuation characters which should be ignored.
public class Exercise11 {
  public static void main(String[] args) {
    houndredmostCommonWords("assets\\input.txt");

  }

  public static void houndredmostCommonWords(String filePath) {
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

    lines.stream()
        .flatMap(word -> Arrays.stream(word.split(" ")))
        .map(word -> word.replaceAll("\\p{Punct}", "").toLowerCase().trim())
        .filter(word -> word.length() > 0)
        .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(100)
        .forEach(element -> System.out.println(element.getKey() + " - " + element.getValue()));
  }
}
