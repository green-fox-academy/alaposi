import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner girls = new Scanner(System.in);
        System.out.println("Enter the number of girls");
        int numberOfGirls = girls.nextInt();

        Scanner boys = new Scanner(System.in);
        System.out.println("Enter the number of boys");
        int numberOfBoys = boys.nextInt();

        if (numberOfBoys == numberOfGirls && (numberOfBoys + numberOfGirls) >= 20) {
            System.out.println("The party is excellent!");
        } else if (numberOfGirls == 0) {
            System.out.println("Sausage party");
        } else if ((numberOfBoys + numberOfGirls) >= 20 && numberOfBoys != numberOfGirls) {
            System.out.println("Quite cool party");
        } else if (numberOfBoys + numberOfGirls < 20) {
            System.out.println("Average party");
        }
    }
}
