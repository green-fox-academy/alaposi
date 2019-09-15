import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        int input1 = input.nextInt();
        int input2 = input.nextInt();

        if (input2 <= input1) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int i = input1; i <= input2; i++) {
                System.out.println(i);
            }
        }
    }
}
