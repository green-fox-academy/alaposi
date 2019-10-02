package pirates;

import java.beans.beancontext.BeanContextMembershipEvent;

public class Main {
  public static void main(String[] args) {

    System.out.println("Drinkinkg test");
    Pirate pirate = new Pirate();


    pirate.howItGoingMate();
    pirate.printStateOfPirate();

    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.howItGoingMate();
    pirate.printStateOfPirate();

    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.howItGoingMate();
    pirate.printStateOfPirate();

    pirate.die();
    pirate.drinkSomeRum();
    pirate.printStateOfPirate();

    System.out.println();
    System.out.println("Battle test");

    Pirate pirate2 = new Pirate();
    Pirate pirate3 = new Pirate();

    pirate2.brawl(pirate3);

    pirate2.printStateOfPirate();
    pirate3.printStateOfPirate();

    System.out.println();
    System.out.println("Ship test");
    Ship ship = new Ship();
    ship.printShipStatus();
    ship.fillShip();
    ship.printShipStatus();







  }
}
