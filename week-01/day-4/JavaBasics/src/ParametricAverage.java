import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    double multiple = input.nextInt();
    int x = 0;

    for (int i = 0; i < multiple; i++) {
      System.out.println("Enter an integer");
      x = x + input.nextInt();
    }

    System.out.println("Sum: " + x);
    System.out.println("Average: " + x / multiple);

  }
}


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4