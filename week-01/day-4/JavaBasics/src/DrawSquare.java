import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the height of th square");
    int num = input.nextInt();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (i == 0 || i == num - 1) {
          System.out.print("%");
        } else if (j == 0 || j == num - 1) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

