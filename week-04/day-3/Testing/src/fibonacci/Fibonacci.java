package fibonacci;

public class Fibonacci {

  public int getFibonacciNumber(int index) {
    int fibonacciNum = 1;
    int temp = 0;
    for (int i = 0; i < index; i++) {
      fibonacciNum += temp;
      temp = fibonacciNum - temp;
    }
    return fibonacciNum;
  }
}
