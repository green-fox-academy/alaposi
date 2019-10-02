package fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  @Test
  public void getFibonacciNumber() {
    Fibonacci test = new Fibonacci();
    int result = test.getFibonacciNumber(5);
    assertEquals(8, result);
  }
}