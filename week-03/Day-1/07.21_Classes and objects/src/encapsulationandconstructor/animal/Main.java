package encapsulationandconstructor.animal;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal();
    Animal cat = new Animal();

    dog.drink();
    dog.eat();
    dog.eat();
    dog.eat();
    dog.drink();
    System.out.println(dog.getHunger());
    System.out.println(dog.getThirst());
    System.out.println("--------");
    dog.play();
    System.out.println(dog.getHunger());
    System.out.println(dog.getThirst());
  }
}
