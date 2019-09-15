import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner mult = new Scanner(System.in);
        System.out.println("Enter the number you want to multiply with");
        int multiplier = mult.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + multiplier + " = " + i * multiplier);
        }
    }
}
