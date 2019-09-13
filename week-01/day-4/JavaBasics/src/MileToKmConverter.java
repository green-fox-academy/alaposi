import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in miles");
        double distanceMile = scanner.nextInt();
        double distanceInKm = distanceMile * 1.609344;

        System.out.println("That is " + distanceInKm + "km.");
    }
}
