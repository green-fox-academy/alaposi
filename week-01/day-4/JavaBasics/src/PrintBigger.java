import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        
        double number1 = num.nextDouble();
        double number2 = num.nextDouble();

        if (number1 > number2) {
            System.out.println(number1 + " is bigger");
        } else if (number2 == number1) {
            System.out.println("They are equal");
        } else {
            System.out.println(number2 + " is bigger");
        }
    }
}
