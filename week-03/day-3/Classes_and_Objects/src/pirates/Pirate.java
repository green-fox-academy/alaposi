package pirates;

import java.util.Random;

public class Pirate {
  public static final int ALIVE = 0;
  public static final int PASSED_OUT = 1;
  public static final int DEAD = -1;

  private int rumCounter;
  private int stateOfPirate;

  public Pirate() {
    this.rumCounter = 0;
    this.stateOfPirate = ALIVE;
  }

  public void drinkSomeRum() {
    if (stateOfPirate == DEAD) {
      System.out.println("He is dead.");
    } else {
      this.rumCounter++;
    }
  }

  public void howItGoingMate() {
    if (this.stateOfPirate == DEAD) {
      System.out.println("He is dead.");
    } else {
      if (rumCounter <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Argh, I'm a Pirate How d'ya d'ink its going");
        this.passOut();
      }
    }
  }

  public void passOut() {
    this.stateOfPirate = PASSED_OUT;
  }

  public void die() {
    this.stateOfPirate = DEAD;
  }


  public int getStateOfPirate() {
    return stateOfPirate;
  }

  public int getRumCounter() {
    return rumCounter;
  }

  public void brawl(Pirate otherPirate) {
    if (this.getStateOfPirate() == ALIVE && otherPirate.getStateOfPirate() == ALIVE) {
      Random random = new Random();
      int result = random.nextInt(3);

      if (result == 0) {
        //this wins
        otherPirate.die();
      } else if (result == 1) {
        //other wins
        this.die();
      } //both pass out
      else if (result == 2) {
        this.passOut();
        otherPirate.passOut();
      }
    }
  }


  public void printStateOfPirate() {
    if (this.getStateOfPirate() == ALIVE) {
      System.out.println("Alive");
    } else if (this.getStateOfPirate() == PASSED_OUT) {
      System.out.println("Passed out");
    } else if (this.getStateOfPirate() == DEAD) {
      System.out.println("Dead");
    }


  }
}
