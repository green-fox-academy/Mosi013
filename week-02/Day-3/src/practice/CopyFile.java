package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  /*
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful*/
  public static void main(String[] args) {
    System.out.println(fileCopier("txt/multiplelines.txt", "txt/newOne.txt"));
  }
  private static boolean fileCopier(String inputFileName, String outputFileName){
    Path inputFilePath = Paths.get(inputFileName);
    Path outputFilePath  = Paths.get(outputFileName);
    List<String> content = new ArrayList<>();
    try {
      content = Files.readAllLines(inputFilePath);
      Files.write(outputFilePath, content);
      return true;
    } catch (IOException e){
      return false;
    }
  }
}
