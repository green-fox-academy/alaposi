import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  public static void main(String[] args) {

    String[] list = {"eggs", "milk", "fish", "apples", "bread", "chicken"};
    ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList(list));

    checker(shoppingList);
  }


  public static void checker(ArrayList<String> sList) {
    if (sList.contains("milk")) {
      System.out.println("We have milk on the list");
    } else {
      System.out.println("We do not have milk on the list");
    }

    if (sList.contains("banana")) {
      System.out.println("we have banana on the list");

    } else {
      System.out.println("We do not have banana on the list");
    }

  }
}


//  Create a list with the following items.
//    Eggs, milk, fish, apples, bread and chicken

//    Create an application which solves the following problems.
//    Do we have milk on the list?
//    Do we have bananas on the list?