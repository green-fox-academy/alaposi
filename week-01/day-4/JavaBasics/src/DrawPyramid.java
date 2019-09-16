import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int lines = input.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 1; j < lines * 2; j++) {
                if (j < (lines - i) || j > (lines + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("wtf");

    }
}
