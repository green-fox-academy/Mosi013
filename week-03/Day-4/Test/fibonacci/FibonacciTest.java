package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  Fibonacci fibo = new Fibonacci();

  @Test
  void fibonacciTest() {
    assertEquals(55, fibo.fibonacci(10));
  }
}