package farm;

public class Animal {
  private int hunger = 50;
  private int thirst = 50;

  public Animal() {
  }

  public Animal(int hunger) {
    this.hunger = hunger;
  }


  public void eat() {
    hunger--;
  }

  public void drink() {

    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public int getHunger() {
    return hunger;
  }
}
