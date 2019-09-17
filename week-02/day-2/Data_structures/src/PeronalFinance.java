import java.util.ArrayList;

public class PeronalFinance {
    public static void main(String[] args) {
//        We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//        How much did we spend?
//                Which was our greatest expense?
//        Which was our cheapest spending?
//                What was the average amount of our spendings?

        ArrayList<Integer> finance = new ArrayList<>();

        finance.add(500);
        finance.add(1000);
        finance.add(1250);
        finance.add(175);
        finance.add(800);
        finance.add(120);

        int totalExpense = 0;
        for (int i = 0; i < finance.size(); i++) {
            totalExpense += finance.get(i);
        }

        int greatest = 0;
        for (int i = 0; i < finance.size(); i++) {
            if (finance.get(i) > greatest) {
                greatest = finance.get(i);
            }
        }

        int cheapest = greatest;
        for (int i = 0; i < finance.size(); i++) {
            if (finance.get(i) < cheapest) {
                cheapest = finance.get(i);
            }

        }

        int average = totalExpense / finance.size();

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Greatest expense: " + greatest);
        System.out.println("Cheapest spending: " + cheapest);
        System.out.println("Average amount spent: " + average);
    }
}
