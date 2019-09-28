package sharpieSet;


public class Sharpie {
  String color;
  double width;
  double inkAmount = 100;

  public Sharpie(String color, double width, double inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount; // ez felülírja a class-nál megadott 100-at
  }

  public Sharpie() {
  }

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }


  public void use(double inkDecrease) {
    inkAmount -= inkDecrease;
  }

  public void sharpiePrinter() {
    System.out.println(color + ", " + width + ", " + inkAmount);
  }
}



//  Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//    which decreases inkAmount