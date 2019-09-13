import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner chicken = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int chickenQty = chicken.nextInt();

        Scanner pig = new Scanner(System.in);
        System.out.println("How many pigs do you have?");
        int pigQty = pig.nextInt();

        int totalLegs = chickenQty * 2 + pigQty * 4;

        System.out.println("Your animals have " + totalLegs + " legs in total");
    }
}
