package part2.main.java.music;

public abstract class Instrument {
  String name;

  public Instrument(String name) {
    this.name = name;
  }

  public abstract void play();
}