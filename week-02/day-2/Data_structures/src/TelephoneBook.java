import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {

    HashMap<String, String> phones = new HashMap<>();

    phones.put("William A. Lathan", "405-709-1865");
    phones.put("John K. Miller", "402-247-8568");
    phones.put("Hortensia E. Foster", "606-481-6467");
    phones.put("Amanda D. Newland", "319-243-5613");
    phones.put("Brooke P. Askew", "307-687-2982");

//    Create an application which solves the following problems.
//
//  What is John K. Miller's phone number?
    System.out.println("The phone number of John K. Miller is: " + phones.get("John K. Miller"));

//  Whose phone number is 307-687-2982?
    for (Map.Entry<String, String> obj : phones.entrySet()) {
      if (obj.getValue() == "307-687-2982") {
        System.out.println("307-687-2982 is the phone number of " + obj.getKey());
      }
    }

//  Do we know Chris E. Myers' phone number?
    System.out.println(phones.containsKey("Chris E. Myers"));


  }
}


