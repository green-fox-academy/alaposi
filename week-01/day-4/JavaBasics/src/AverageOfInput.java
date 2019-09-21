import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");

        double sumNumber = 0;
        int nrOfNumbers = 5;

        for (int i = 0; i < nrOfNumbers ; i++) {
            sumNumber += input.nextInt();
            //System.out.println(sumNumber);

        }
        System.out.println(sumNumber);

        double average = sumNumber / nrOfNumbers;
        System.out.println(average);

    }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
