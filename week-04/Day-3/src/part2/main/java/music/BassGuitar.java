package part2.main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
  }

  public BassGuitar() {
    this(4);
  }
}