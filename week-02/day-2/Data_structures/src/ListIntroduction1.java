import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));
        }

        names.remove(1);
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));

        }

        names.clear();

    }


}


//    Create an empty list which will contain names (strings)
//    Print out the number of elements in the list
//        Add William to the list
//        Print out whether the list is empty or not
//        Add John to the list
//        Add Amanda to the list
//        Print out the number of elements in the list
//        Print out the 3rd element
//        Iterate through the list and print out each name
//        William
//        John
//        Amanda

//        Iterate through the list and print
//        1. William
//        2. John
//        3. Amanda

//        Remove the 2nd element

//        Iterate through the list in a reversed order and print out each name
//        Amanda
//        William

//        Remove all elements
