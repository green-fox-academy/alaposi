package petrolStation;

public class Main {
  public static void main(String[] args) {

    Car car1 = new Car("Opel");
    Station station1 = new Station(1000, "Shell");

    System.out.println("gas amount of " + station1.name + " before refill is " + station1.gasAmount);
    System.out.println("gas amount of " + car1.name + " before refill is " + car1.gasAmount);

    station1.refill(car1);

    System.out.println("gas amount of " + station1.name + " after refill is " + station1.gasAmount);
    System.out.println("gas amount of " + car1.name + " after refill is " + car1.gasAmount);


  }
}
