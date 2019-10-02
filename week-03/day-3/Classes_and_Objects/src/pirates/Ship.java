package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> pirates = new ArrayList<>();
  private Pirate captain;

  public void fillShip() {
    //add captain
    this.captain = new Pirate();
    // fill crew
    Random random = new Random();
    int numberOfPirates = random.nextInt(12) + 1; // mert nem lehet 0 kalóz

    for (int i = 0; i < numberOfPirates; i++) {
      pirates.add(new Pirate());
    }
  }

  public int getNumberOfPiratesAlive() {
    int aliveCounter = 0;
    for (Pirate pirate : pirates) {
      if (pirate.getStateOfPirate() == Pirate.ALIVE) {
        aliveCounter++;
      }
    }
    return aliveCounter;
  }

  public void printShipStatus() {
    if (captain == null) {
      System.out.println("Ship is empty");
    } else {
      // ship is filled
      System.out.print("Captain consumed " + captain.getRumCounter() + " rum and he is ");
      if (captain.getStateOfPirate() == Pirate.ALIVE) {
        System.out.println("alive");
      } else if (captain.getStateOfPirate() == Pirate.PASSED_OUT) {
        System.out.println("passed out");
      } else if (captain.getStateOfPirate() == Pirate.DEAD) {
        System.out.println("dead");
      }
      System.out.println("Number of alive pirates in crew is " + getNumberOfPiratesAlive() + " out of " + pirates.size());
    }

  }

}
