package petrolStation;

public class Station {
  int gasAmount;
  String name;

  public Station(int gasAmount, String name) {
    this.gasAmount = gasAmount;
    this.name = name;
  }

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
