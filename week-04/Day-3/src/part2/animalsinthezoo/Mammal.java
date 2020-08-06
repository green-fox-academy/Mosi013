package part2.animalsinthezoo;

public class Mammal extends Animal {


  public Mammal(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }
}
