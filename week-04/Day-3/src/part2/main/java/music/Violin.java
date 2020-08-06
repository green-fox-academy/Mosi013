package part2.main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    super("Violin", numberOfStrings);
  }

  public Violin() {
    this(4);
  }
}