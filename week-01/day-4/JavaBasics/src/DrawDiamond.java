import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the lines of the diamond");
        int linesAll = input.nextInt();
        int linesTop = (linesAll + 1) / 2;

        for (int i = 0; i < linesTop - 1; i++) {
            for (int j = 1; j < linesAll * 2; j++) {
                if (j < (linesTop - i) || j > (linesTop + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = ((linesAll - 1) / 2); i >= 0; i--) {
            for (int j = (linesAll - (linesAll-1)/2); j < linesAll * 2; j++) {
                if (j < (linesAll - i) || j > (linesAll + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}


