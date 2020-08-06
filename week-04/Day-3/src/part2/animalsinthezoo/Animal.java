package part2.animalsinthezoo;

import part2.main.java.music.StringedInstrument;

public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;
  protected int numberOfLegs;
  protected int numberOfWings;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();
}
