import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        region Task description
//        Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A
//        endregion

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = new ArrayList<>(ListA);

        System.out.println(ListB.size());

        ListB.remove(3);

        ListA.add(4, "Kiwifruit");

        if (ListA.size() < ListB.size()) {
            System.out.println(ListA + " is smaller");
        } else if (ListA.size() > ListB.size()) {
            System.out.println("ListA is bigger");
        } else {
            System.out.println("Size of ListA and ListB are equal");
        }

        //nice version
        if (ListA.size() != ListB.size()) {
            System.out.println("not the same size");
        } else {
            System.out.println("Same size");
        }

        System.out.println("the index of Avocado in ListA is " + ListA.indexOf("Avocado"));
        System.out.println("the index of durian in ListB is " + ListB.indexOf("Durian") );

        String [] p= {"Passion Fruit", "Pomelo"};
        ListB.addAll(Arrays.asList(p));
        //System.out.println(ListB);

        System.out.println(ListA.get(3));

    }
}


//        Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A