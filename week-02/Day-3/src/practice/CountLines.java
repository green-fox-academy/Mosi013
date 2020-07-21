package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  /*
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.*/
  public static void main(String[] args) throws IOException {
    System.out.println(counter("txt/my-file.txt"));
  }
  public static int counter(String fileName) {
    Path filePath = Paths.get(fileName);
    try {
      List<String> lines = Files.readAllLines(filePath);
      return lines.size();
    } catch (Exception e) {
      return 0;
    }
  }
}
