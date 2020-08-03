package fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(11));
  }
  public static int fibonacci(int n) {
    int a = 0, b = 1, x = 0;
    while (x++ < n)
    {
      b += a;
      a = b-a;
    }
    return a;
  }

}
