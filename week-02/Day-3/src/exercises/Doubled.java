package exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubled {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts the duplicated-chars.txt
    destroyDuplicated("txt/duplicated-chars.txt", "txt/asd.txt");
  }

  private static void destroyDuplicated(String inputFile, String outputFile) throws IOException {
    Path filePath = Paths.get(inputFile);
    Path outFilePath = Paths.get(outputFile);
    List<String> file = new ArrayList<>();
    ArrayList<String> stringArray = new ArrayList<>();
    String holder = "";

    try {
      file = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (String line : file) {
      line += "\n";
      for (int i = 0; i < line.length(); i++) {
        if (i % 2 == 0){
          holder += line.charAt(i);
        }
      }
    }


    Files.write(outFilePath, Collections.singleton(holder));

  }
}