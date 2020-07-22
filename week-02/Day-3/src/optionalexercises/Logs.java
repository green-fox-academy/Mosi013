package optionalexercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

  // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    System.out.println(uniqueIP("txt/log.txt"));
    System.out.println(ratio("txt/log.txt"));
  }

  private static List<String> uniqueIP(String input) {
    Path filePath = Paths.get(input);
    List<String> lines = new ArrayList<>();
    List<String> IP = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (String ips : lines) {
      IP.add(ips.substring(27, 38));
    }

    return IP;
  }

  private static double ratio(String input) {
    Path filePath = Paths.get(input);
    List<String> lines = new ArrayList<>();
    double GET = 0;
    double POST = 0;
    double ratio;
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (String rt : lines) {
      if (rt.contains("GET")){
        GET++;
      }else if (rt.contains("POST")){
        POST++;
      }
    }
    ratio = GET / POST;
    return ratio;
  }

}
