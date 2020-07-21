package practice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class WriteMultipleLines {
  /*
// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.*/
  public static void main(String[] args) {
    multipleLines("txt/multipleLines.txt", "MindF#$k", 10);
  }
  private static void multipleLines(String path, String word, int number){
    Path filePath = Paths.get(path);
    ArrayList<String> text = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      text.add(word);
    }
    try {
      Files.write(filePath, text);
    } catch (Exception e) {

    }
  }
}