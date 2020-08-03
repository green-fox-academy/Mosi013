package pirate;

public class WarApp {
  public static void main(String[] args) {
    Armada armada1 = new Armada();
    Armada armada2 = new Armada();
    armada1.fillArmada(20);
    armada2.fillArmada(19);
    armada1.war(armada2);
  }
}
