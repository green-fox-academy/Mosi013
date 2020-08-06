package part1.charsequence;

public class Shifter implements CharSequence {

  String shifter;
  int shift;

  public Shifter(String shifter, int shift) {
    this.shifter = shifter;
    this.shift = shift;
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
