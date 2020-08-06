package part2.main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public String sound() {
    if (name.equals("Electric Guitar")) {
      return "Twang";
    } else if (name.equals("Bass Guitar")) {
      return "Duum-duum-duum";
    } else {
      return "Screech";
    }
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}