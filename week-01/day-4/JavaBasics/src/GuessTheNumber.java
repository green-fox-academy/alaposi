import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    int stored = 8;
    Scanner input = new Scanner(System.in);
    System.out.println("Guess the stored number");
    int guessed = input.nextInt();

    if (guessed < stored ){
      System.out.println("The stored number is higher");
    }
    else if (guessed > stored){
      System.out.println("The stored number is lower");
    }
    else {
      System.out.println("You found the number : " + stored);
    }

  }
}


// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8