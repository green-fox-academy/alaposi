import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase22 {
  public static void main(String[] args) {
    HashMap<String, Integer> priceList = new HashMap<>();

    priceList.put("Eggs", 200);
    priceList.put("Milk", 200);
    priceList.put("Fish", 400);
    priceList.put("Apples", 150);
    priceList.put("Bread", 50);
    priceList.put("Chicken", 550);

    priceCheck(priceList);

    //Which products cost less than 201? (just the name)
    //Which products cost more than 150? (name + price)
  }

  public static void priceCheck(HashMap<String, Integer> priceList) {
    ArrayList<String> products = new ArrayList<>();
    for (Map.Entry<String, Integer> obj : priceList.entrySet()) {
      if (obj.getValue() < 201) {
        products.add(obj.getKey());
      }
    }
    System.out.println("The following products cost less than 201: "+ products);

    String moreThan = "";
    for (Map.Entry<String, Integer> obj : priceList.entrySet()) {
      if (obj.getValue() > 150) {
        moreThan = moreThan + obj.getKey() + " " + obj.getValue() + ",";
      }
    }

    System.out.println("The following products cost more than 150: " + moreThan);

  }
}
