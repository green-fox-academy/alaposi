package diceSet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // You have a `DiceSet` class which has a list for 6 dice
    // You can roll all of them with roll()
    // Check the current rolled numbers with getCurrent()
    // You can reroll with reroll()
    // Your task is to roll the dice until all of the dice are 6

    DiceSet diceSet = new DiceSet();

    diceSet.roll();

    int[] allSix = {6, 6, 6, 6, 6, 6};
    int counter = 1;

    for (int i = 0; i < allSix.length ; i++) {
      if(allSix[i] == diceSet.dice.get(i)){
        System.out.println(diceSet.getCurrent(i));
      } else {
        System.out.println(diceSet.getCurrent(i));
        i = -1;  // azért -1, mert a for ciklus végén az i++-szal így lesz újra 0
        diceSet.reroll();
      }
      counter++;

    }
    System.out.println(diceSet.getCurrent());
    System.out.println(counter);




//
//    System.out.println(diceSet.getCurrent());
//    System.out.println(diceSet.roll());
//    System.out.println(diceSet.getCurrent());
//    System.out.println(diceSet.getCurrent(5));
//    diceSet.reroll();
//    System.out.println(diceSet.getCurrent());
//    diceSet.reroll(4);
//    System.out.println(diceSet.getCurrent());
  }

}