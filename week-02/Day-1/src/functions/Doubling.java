package functions;

public class Doubling {
  public static void main(String[] args) {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

    int baseNUm = 123;
    System.out.println(doubling(baseNUm));
  }

  public static int doubling(int num) {
    return num * 2;
  }
}