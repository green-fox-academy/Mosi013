package exercises;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) throws IOException {
    // Create a method that decrypts reversed-order.txt
    reversText("txt/reversed-order.txt", "txt/asd3.txt");

  }

  private static void reversText(String input, String output) throws IOException {
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

    for (int i = lines.size() - 1; i >= 0; i--) {
      holder = holder + lines.get(i) + "\n";
    }
    Files.write(Paths.get(output), Collections.singleton(holder));

  }
}