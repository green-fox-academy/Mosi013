package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"
    Path path = Paths.get("txt/my-file.txt");
    Path path2 = Paths.get("txt/my-file.txasdqwdq");
    printer(path);
    printer(path2);
    System.out.println("--------");
    reader("txt/my-file.txt");
    reader("txt/asdsad.txt");
  }

  public static void printer(Path path) {
    try {
      List<String> lines = Files.readAllLines(path);
      lines.stream().forEach(line -> System.out.println(line));
    } catch (NoSuchFileException e) {
      System.out.println("The file couldn't found.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void reader(String fileName){
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(Paths.get(fileName));
    } catch (NoSuchFileException e) {
      System.out.println("File doesn't exists");
    }catch (IOException e){
      System.out.println("File isn't readable");
    }
    System.out.println(lines);
  }

}