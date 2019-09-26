package fleetOfThings;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing thing1 = new Thing("Stand up");
    Thing thing2 = new Thing("Eat lunch");

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(thing1);
    fleet.add(thing2);

    thing1.complete();
    thing2.complete();

    System.out.println(fleet);
  }
}

// - You have the `Thing` class
// - You have the `Fleet` class
// - You have the `FleetOfThings` class with a `main` method
// - Download those, use those
// - In the main method create a fleet
// - Achieve this output:
// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch