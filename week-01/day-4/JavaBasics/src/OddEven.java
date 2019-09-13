import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        double number = input.nextDouble();

        if ((number % 2) == 0) {
            System.out.println("this is an even number ");
        } else {
            System.out.println("this is an odd number");
        }
    }

}
