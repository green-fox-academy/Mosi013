package classesasfields.farm;

import encapsulationandconstructor.animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Farm {
  private List<Animal> listOfAnimal;
  private int freeSlots;

  public Farm(int freeSlots) {
    this.listOfAnimal = new ArrayList<Animal>();
    this.freeSlots = freeSlots;
  }

  public void breed(){
    if (listOfAnimal.size() < this.freeSlots){
      listOfAnimal.add(new Animal());
    }
  }


  public void sick(int kill){
    for (int i = 0; i < kill ; i++) {
      listOfAnimal.remove(i);
    }
  }
}
