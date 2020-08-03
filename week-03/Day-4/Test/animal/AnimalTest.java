package animal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AnimalTest {
  Animal animal;

  @Test
  void returnDefaultValues(){
    animal = new Animal();
    Assert.assertEquals(100, animal.getHunger() + animal.getThirst());
  }

  @Test
  void settersTest(){
    animal = new Animal();
    animal.setThirst(5);
    animal.setHunger(5);
    Assert.assertEquals(10, animal.getHunger() + animal.getThirst());
  }

  @Test
  void eatMethodTest() {
    animal = new Animal();
    animal.eat();
    Assert.assertEquals(49, animal.getHunger());
  }

  @Test
  void drinkMethodTest() {
    animal = new Animal();
    animal.drink();
    Assert.assertEquals(49, animal.getThirst());
  }

  @Test
  void playMethodTest() {
    animal = new Animal();
    animal.play();
    Assert.assertEquals(102, animal.getThirst() + animal.getHunger());
  }
}