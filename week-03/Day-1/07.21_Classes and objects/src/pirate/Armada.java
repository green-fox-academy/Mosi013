package pirate;

import java.util.ArrayList;
import java.util.List;

/*Create an Armada class
Contains Ship-s as a list

Have a armada.war(otherArmada) method where two armada can engage in war
it should work like merge sort
first ship from the first armada battles the first of the other
the loser gets skipped so the next ship comes in play from that armada
whichever armada gets to the end of its ships loses the war
return true if this is the winner*/
public class Armada {
  private List<Ship> shipList = new ArrayList<>();

  public void fillArmada(int numberofShips) {
    for (int i = 0; i < numberofShips; i++) {
      this.shipList.add(new Ship());
    }
  }

  public boolean war(Armada otherArmada) {
    boolean isThisArmadaWon = false;
    int firstArmadaShipIndex = 0;
    int secondArmadaShipsIndex = 0;

    System.out.println("War has begun");
    System.out.println("First Armada has " + this.shipList.size() + " number of ships");
    System.out.println("Second Armada has " + otherArmada.shipList.size() + " number of ships");
    while (this.shipList.size() != 0 || otherArmada.shipList.size() != 0) {
      if (this.shipList.get(firstArmadaShipIndex).battle(otherArmada.shipList.get(secondArmadaShipsIndex))){
        secondArmadaShipsIndex++;
      }else {
        firstArmadaShipIndex++;
      }
    }
    return secondArmadaShipsIndex == otherArmada.shipList.size();
  }

}
