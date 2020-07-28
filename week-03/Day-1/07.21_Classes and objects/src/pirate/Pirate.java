package pirate;
/*Create a Pirate class. While you can add other fields and methods, you must have these methods:-

drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
If you manage to get this far, then you can try to do the following.

die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
And... if you get that far...

Add a parrot.*/

public class Pirate {
  private boolean intoxicated;
  private boolean isPassedOut;
  private boolean isAlive;
  private boolean ishasAParrot;
  private int rumLvl;


  public Pirate() {
    this.intoxicated = false;
    this.isPassedOut = false;
    this.isAlive = true;
    this.ishasAParrot = false;
    this.rumLvl = 0;
  }

  public void drinkSomeRum() {
    this.intoxicated = true;
    rumLvl++;
  }

  public String howsItGoingMate() {
    String status = "";
    if (this.isAlive){
      if (!isPassedOut){
        if (this.rumLvl <= 4){
          status = "Poor me anudder!";
        } else if (this.rumLvl > 4 && this.rumLvl < 7){
          status = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
          isPassedOut = true;
        } else if (this.rumLvl >= 7){
          status = "Pirate went wrong, he is dead";
          isAlive = false;
        }
      }
    }
    return status;
  }

  public void die() {
    this.isAlive = false;
  }

  public String brawl(Pirate otherPirate) {
    String status = "";
    if (otherPirate.isAlive && this.isAlive) {
      if (brawlChance() == 1) {
        this.die();
        status = "First pirate is dead";
      } else if (brawlChance() == 2) {
        otherPirate.die();
        status = "Second pirate is dead";
      } else {
        this.isPassedOut = true;
        otherPirate.isPassedOut = true;
        status = "They were sooo drunk, both passed out.";
      }
    }else {
      status = "One of them are dead";
    }
    return status;
  }

  private int brawlChance(){
    int brawlNum= (int) (Math.random() * 4) + 1;
    return brawlNum;
  }

  public boolean hasAParrot() {
    return this.ishasAParrot = true;
  }

  public int getRumLvl() {
    return rumLvl;
  }

  public boolean isAlive() {
    return isAlive;
  }

}




