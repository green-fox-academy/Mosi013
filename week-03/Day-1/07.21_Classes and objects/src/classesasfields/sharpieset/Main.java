package classesasfields.sharpieset;

public class Main {
  public static void main(String[] args) {
    Sharpie sharpi = new Sharpie("Black", 30);
    Sharpie sharpie = new Sharpie("Red", 20);
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.sharpiesList.add(sharpi);
    sharpieSet.sharpiesList.add(sharpie);
    for (int i = 0; i < 100; i++) {
      sharpieSet.sharpiesList.get(1).use();
    }
    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
  }
}
