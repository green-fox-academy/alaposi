import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> prices = new HashMap<>();
    prices.put("Eggs", 200);
    prices.put("Milk", 200);
    prices.put("Fish", 400);
    prices.put("Apples", 150);
    prices.put("Bread", 50);
    prices.put("Chicken", 550);

//    How much is the fish?
    System.out.println("The price of the fish is " + prices.get("Fish"));

//    What is the most expensive product?
    int mostExp = 0;
    String most = "";
    for (Map.Entry<String, Integer> obj : prices.entrySet()) {
      if (obj.getValue() > mostExp) {
        mostExp = obj.getValue();
        most = obj.getKey();
      }
    }
    System.out.println("The most expensive product is " + most);


//    What is the average price?
    int sum = 0;
    for (Map.Entry<String, Integer> obj : prices.entrySet()) {
      sum = sum + obj.getValue();
    }
    System.out.println("The average price of the products is " + (double) sum / prices.size());

//    How many products' price is below 300?
    int x = 0;
    for (Map.Entry<String, Integer> obj: prices.entrySet()) {
      if(obj.getValue() < 300) {
        x += 1;
      }
    }
    System.out.println("There are " + x + " products under 300.");


//    Is there anything we can buy for exactly 125?
    if (prices.containsValue("125") == true){
      System.out.println("We can buy anything for exacly 125");
    } else {
      System.out.println("We can't buy anything for exacly 125");
    }



//    What is the cheapest product?
    int min = mostExp;
    String cheapest = "";

    for (Map.Entry<String, Integer> obj: prices.entrySet()) {
      if (obj.getValue() < min) {
        min = obj.getValue();
        cheapest = obj.getKey();
      }
    }
    System.out.println("The cheapest product is " + cheapest);


  }
}


