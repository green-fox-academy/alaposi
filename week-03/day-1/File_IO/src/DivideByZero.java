import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("enter the number you would like to divide ten with");
//    int number = scanner.nextInt();
//    ide fölösleges a scanner!

    int number = 10;

    divide(number);
  }

  public static void divide(int num) {
    try {
      System.out.println(10 / num);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
