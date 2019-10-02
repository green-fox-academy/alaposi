package fibonacci;

public class Main {
  public static void main(String[] args) {


    Fibonacci fib = new Fibonacci();

    for (int i = 0; i < 6; i++) {
      System.out.print((fib.getFibonacciNumber(i))+ ",");
    }

  }
}
