package printingtotheterminalwindow;

public class HelloOthers {
  public static void main(String[] args) {
    // Greet 3 of your classmates with this program, in three separate lines
    // like:
    //
    // Hello, Esther!
    // Hello, Mary!
    // Hello, Joe!
    String[] names = {"Dani","Kenji","Dávid"};

    for (int i = 0; i <names.length ; i++) {
      System.out.println(names[i] + " ");
    }
  }
}
