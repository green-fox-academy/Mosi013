package loops;

public class IWontCheatOnTheExams {

// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

  public static void main(String[] args) {
    String cheat = "I won't cheat on the exam!";

    for (int i = 1; i <= 100; i++) {
      System.out.println(i + " " +cheat);
    }
  }
}
