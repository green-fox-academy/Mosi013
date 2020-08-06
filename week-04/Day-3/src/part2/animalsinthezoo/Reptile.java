package part2.animalsinthezoo;

public class Reptile extends Animal{

  public Reptile(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String breed() {
    return "laying eggs";
  }
}
