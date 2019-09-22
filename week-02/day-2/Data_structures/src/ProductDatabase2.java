import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
  public static void main(String[] args) {
    HashMap<String, Integer> prices = new HashMap<>();
    prices.put("Eggs", 200);
    prices.put("Milk", 200);
    prices.put("Fish", 400);
    prices.put("Apples", 150);
    prices.put("Bread", 50);
    prices.put("Chicken", 550);

//  Create an application which solves the following problems.
//    Which products cost less than 201? (just the name)
//    Which products cost more than 150? (name + price)

    checker(prices);
  }

  public static void checker(HashMap<String, Integer> prices) {
    HashMap<String, Integer> less = new HashMap<>();
    System.out.print("The following products cost less than 201: ");
    for (Map.Entry<String, Integer> obj : prices.entrySet()) {
      if (obj.getValue() < 201)
        System.out.print(obj.getKey() + ", ");
       }


      HashMap<String, Integer> more = new HashMap<>();
      System.out.println("\nThe following products cost more than 150: ");

      for (Map.Entry<String, Integer> obj : prices.entrySet()) {
        if (obj.getValue() > 150) {
          more.put(obj.getKey(), obj.getValue());
          System.out.println(obj.getKey() + ": " + obj.getValue());
        }
      }
    }
  }






