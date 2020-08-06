package part2.animalsinthezoo;

import part3.flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
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

  @Override
  public void land() {
    System.out.println("The bird has landed.");
  }

  @Override
  public void fly() {
    System.out.println("The bird is flying.");
  }

  @Override
  public void takeOff() {
    System.out.println("The bird is taking off.");
  }
}
