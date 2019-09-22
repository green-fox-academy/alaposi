import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {

    HashMap<String, Double> prices = new HashMap<>();
    prices.put("Milk", 1.07);
    prices.put("Rice", 1.59);
    prices.put("Eggs", 3.14);
    prices.put("Cheese", 12.60);
    prices.put("Chicken Breasts", 9.40);
    prices.put("Apples", 2.31);
    prices.put("Tomato", 2.58);
    prices.put("Potato", 1.75);
    prices.put("Onion", 1.10);

    HashMap<String, Integer> bob = new HashMap<>();
    bob.put("Milk", 3);
    bob.put("Rice", 2);
    bob.put("Eggs", 2);
    bob.put("Cheese", 1);
    bob.put("Chicken Breasts", 4);
    bob.put("Apples", 1);
    bob.put("Tomato", 2);
    bob.put("Potato", 1);

    HashMap<String, Integer> alice = new HashMap<>();
    alice.put("Rice", 1);
    alice.put("Eggs", 5);
    alice.put("Chicken Breasts", 2);
    alice.put("Apples", 1);
    alice.put("Tomato", 10);
    //alice.put("Potato", 2);


//    How much does Bob pay?
    double bobPayment = 0;
    for (Map.Entry<String, Double> obj : prices.entrySet()) {
      for (Map.Entry<String, Integer> obj2 : bob.entrySet()) {
        if (obj2.getKey() == obj.getKey()) {
          bobPayment += obj2.getValue() * obj.getValue();
        }
      }
    }
    System.out.println("Bob pays " + bobPayment);

//    How much does Alice pay?
    double alicePayment = 0;
    for (Map.Entry<String, Double> obj : prices.entrySet()) {
      for (Map.Entry<String, Integer> obj2 : alice.entrySet()) {
        if (obj2.getKey() == obj.getKey()) {
          alicePayment += obj2.getValue() * obj.getValue();
        }
      }
    }
    System.out.println("Alice pays " + alicePayment);

//    Who buys more Rice?
    if (bob.get("Rice") > alice.get("Rice")) {
      System.out.println("Bob buys more rice.");
    } else if (alice.get("Rice") > bob.get("Rice")) {
      System.out.println("Alice buys more rice.");
    } else {
      System.out.println("Alice and Bob buy the same amount of rice");
    }

//    Who buys more Potato?
    if (bob.containsKey("Potato") && alice.containsKey("Potato")) {
      if (bob.get("Potato") > alice.get("Potato")) {
        System.out.println("Bob buys more potato");
      } else if (alice.get("Potato") > bob.get("Potato")) {
        System.out.println("Alice buys more potato");
      } else {
        System.out.println("They buy the same qty of potato");
      }
    } else if (bob.containsKey("Potato")) {
      System.out.println("Bob buys more potato");
    } else {
      System.out.println("Alice buys more potato.");
    }

//    Who buys more different products?
    if (bob.size() > alice.size()) {
      System.out.println("Bob muys more different products.");
    } else if (bob.size() == alice.size()) {
      System.out.println("They buy the same amount of products.");
    } else {
      System.out.println("Alice buys more different products.");
    }

//    Who buys more products? (piece)
    int qtyBob = 0;
    int qtyAlice = 0;

    for (Map.Entry<String, Integer> obj : bob.entrySet()) {
      qtyBob += obj.getValue();
    }
    for (Map.Entry<String, Integer> obj : alice.entrySet()) {
      qtyAlice += obj.getValue();
    }

    if (qtyBob > qtyAlice) {
      System.out.println("Bob buys more pieces");
    } else if (qtyAlice > qtyBob) {
      System.out.println("Alice buys more pieces");
    } else {
      System.out.println("They buy the same volume");
    }

  }
}


//    How much does Bob pay?
//    How much does Alice pay?
//    Who buys more Rice?
//    Who buys more Potato?
//    Who buys more different products?
//    Who buys more products? (piece)
