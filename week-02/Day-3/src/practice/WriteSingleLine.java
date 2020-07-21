package practice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    manipulator();
  }
  private static void manipulator(){
    Path filePath = Paths.get("txt/my-file.txt");
    String myName = "Mosonyi Márk";
    try {
      Files.write(filePath, Collections.singleton(myName));
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}