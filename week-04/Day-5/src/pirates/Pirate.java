package pirates;

/*Create a Pirate class. While you can add other fields and methods, you must have these methods:-

drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
If you manage to get this far, then you can try to do the following.

die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive)
and there's a 1/3 chance, 1 dies, the other dies or they both pass out.*/
public class Pirate {
  private int rumlevel;
  private boolean passOut;
  private boolean isDead;
  private boolean isIntoxicated;
  private boolean hasWoodenLeg;

  public Pirate() {
  }

  public void drinkSomeRum() {
    rumlevel++;
    isIntoxicated = true;
  }

  public String howItGoingMate() {
    if (rumlevel <= 4) {
      return "Pour me anudder!";
    } else {
      if (rumlevel > 4 && rumlevel <= 8) {
        passOut = true;
        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      } else {
        die();
      }
      return "He is dead";
    }
  }

  public void die() {
    isDead = true;
  }

  public void brawl(Pirate pirate){
    if (randomizer() == 1)
  }

  private int randomizer() {
    int random = (int) (Math.random() * 3) + 1;
    return random;
  }
}
