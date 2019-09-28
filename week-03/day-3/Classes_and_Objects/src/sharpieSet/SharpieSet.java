package sharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("blue", 0.5, 100);
    Sharpie sharpie2 = new Sharpie("red", 0.3);
    Sharpie sharpie3 = new Sharpie("green", 0.5, 0);

    List<Sharpie> mySharpies = new ArrayList<>();
    mySharpies.add(sharpie1);
    mySharpies.add(sharpie2);
    mySharpies.add(sharpie3);
    mySharpies.add(sharpie3);
    mySharpies.add(sharpie3);
    mySharpies.add(sharpie1);
    mySharpies.add(sharpie3);
    mySharpies.add(sharpie1);
    mySharpies.add(sharpie3);
    mySharpies.add(sharpie1);

    System.out.println(mySharpies.size());
    System.out.println(countUsable(mySharpies));

    removeTrash2(mySharpies);
    System.out.println(mySharpies.size());


  }

  public static int countUsable(List<Sharpie> list) {
    int counter = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }


  public static void removeTrash(List<Sharpie> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).inkAmount == 0) {
        list.remove(i);
        i = -1;
      }
    }
  }

//  public static void removeTrash(List<Sharpie> list) {
//    for (int i = 0; i < list.size(); i++) {
//      if (list.get(i).inkAmount == 0) {
//        list.remove(i);
//      }
//    }
//  }

  // ez jobb
  public static void removeTrash2(List<Sharpie> list) {
    for (int i = list.size()-1; i > 0; i--) {
      if (list.get(i).inkAmount == 0) {
        list.remove(i);
      }
    }
  }
}


//  Sharpie Set
//  Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//        countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies

//sharpie examples
//  Sharpie sharpie1 = new Sharpie("blue", 0.5, 100);
//  Sharpie sharpie2 = new Sharpie("red", 0.3);
//  Sharpie sharpie3 = new Sharpie("green", 0.5, 0);



