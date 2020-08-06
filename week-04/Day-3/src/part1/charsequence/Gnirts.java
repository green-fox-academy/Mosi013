package part1.charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  String text;

  public Gnirts(String inputText) {
    this.text = inputText;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

}
