import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = myScanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
