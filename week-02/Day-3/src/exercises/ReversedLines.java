package exercises;

import com.sun.jdi.event.StepEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts reversed-lines.txt
    reverse("txt/reversed-lines.txt", "txt/asd2.txt");

  }

  private static void reverse (String input, String output) throws IOException {
    Path inFilePath = Paths.get(input);
    Path outFilePath = Paths.get(output);
    List<String> lines = new ArrayList<>();
    List<String> outputLines = new ArrayList<>();
    String holder = "";

    try {
      lines = Files.readAllLines(inFilePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (String line : lines){
      line += "\n";
      for (int i = line.length() - 1; i >= 0; i--) {
        holder = holder + line.charAt(i);
      }
    }

    Files.write(Paths.get(output), Collections.singleton(holder));
  }
}