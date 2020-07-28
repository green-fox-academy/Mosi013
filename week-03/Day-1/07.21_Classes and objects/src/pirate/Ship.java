package pirate;
/*The place for the Pirates

Create a Ship class.
The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
When a ship is created it doesn't have a crew or a captain.
The ship can be filled with pirates and a captain via fillShip() method.
Filling the ship with a captain and random number of pirates.
Ships should be represented in a nice way on command line including information about
captains consumed rum, state (passed out / died)
number of alive pirates in the crew
Ships should have a method to battle other ships: ship.battle(otherShip)
should return true if the actual ship (this) wins
the ship should win if its calculated score is higher
calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
The loser crew has a random number of losses (deaths).
The winner captain and crew has a party, including a random number of rum :)*/

import java.util.ArrayList;
import java.util.List;

public class Ship {
  private List<Pirate> listOfPirates;
  private Pirate captain;

  public Ship() {
    this.listOfPirates = new ArrayList<>();
  }

  public void fillShip() {
    this.captain = new Pirate();
    int crew = randomNumber(20);
    for (int i = 0; i < crew; i++) {
      this.listOfPirates.add(new Pirate());
    }
  }

  private int randomNumber(int maxLimit) {
    int randomNum = (int) ((Math.random() * maxLimit) + 1);
    return randomNum;
  }

  public void getStatusOfShipsCrew() {
    System.out.println("Captain is " + getAlivePirates());
    System.out.println("Alive pirates number is " + getAlivePirates());
  }


  private int getAlivePirates() {
    int alivePirates = 0;
    for (Pirate pirate : this.listOfPirates) {
      if (pirate.isAlive()) {
        alivePirates++;
      }
    }
    return alivePirates;
  }

  private String getCapitanStatus() {
    String status = "";
    if (captain.getRumLvl() > 4 || captain.getRumLvl() <= 7) {
      status = "Passed out";
    } else if (captain.getRumLvl() > 7) {
      status = "Died";
    }
    return status;
  }

  public boolean battle(Ship otherShip) {
    boolean win;
    if (this.scoreCalculator() > otherShip.scoreCalculator()) {
      win = true;
      System.out.println("First ship won");
      for (int i = 0; i < otherShip.randomNumsOfDeaths(listOfPirates.size()); i++) {
        otherShip.listOfPirates.remove(i);
        this.party(this.listOfPirates.size());
      }
    } else {
      win = false;
      System.out.println("Second ship won");
      for (int i = 0; i < this.randomNumsOfDeaths(this.listOfPirates.size()); i++) {
        this.listOfPirates.remove(i);
        otherShip.party(otherShip.listOfPirates.size());
      }
    }
    return win;
  }

  private int scoreCalculator() {
    int score = getAlivePirates() - captain.getRumLvl();
    return score;
  }

  private int randomNumsOfDeaths(int num) {
    int death = (int) (Math.random() * num);
    return death;
  }

  private void party(int num) {
    randomNumberOfRum(num);
  }

  private int randomNumberOfRum(int num) {
    int rumNum = (int) (Math.random() * num);
    return rumNum;
  }
}
