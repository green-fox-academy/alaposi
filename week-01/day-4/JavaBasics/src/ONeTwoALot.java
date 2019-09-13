import java.util.Scanner;

public class ONeTwoALot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        double inPut = input.nextDouble();

        if (inPut <= 0) {
            System.out.println("Not enough");
        } else if (inPut == 1) {
            System.out.println("One");
        } else if (inPut == 2) {
            System.out.println("Two");
        } else if (inPut > 2) {
            System.out.println("A lot");
        }
    }
}
