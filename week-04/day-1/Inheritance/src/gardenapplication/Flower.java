package gardenapplication;

public class Flower {
  private String color;
  private double currentWaterAmount;
  private double absorbWaterPercent = 0.75;

  public Flower(String color, double currentWaterAmount) {
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() {
    return color;
  }

  public String getWaterStatus() {
    if (currentWaterAmount < 5) {
      return "needs water";
    } else {
      return "doesn't need water";
    }
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(double waterAdded) {
    this.currentWaterAmount += waterAdded*absorbWaterPercent;
  }
}
