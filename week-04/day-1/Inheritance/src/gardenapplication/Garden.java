package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Flower> flowers;
  private List<Tree> trees;

  public Garden() {
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
    this.flowers.add(new Flower("yellow", 4));
    this.flowers.add(new Flower("blue", 4));
    this.trees.add(new Tree("purple", 5));
    this.trees.add(new Tree("orange", 5));
  }

  public void printStatus() {
    for (int i = 0; i < flowers.size(); i++) {
      Flower actualFlower = this.flowers.get(i);
      System.out.println("The " + actualFlower.getColor() + " " + actualFlower.getClass().getSimpleName() + " " + actualFlower.getWaterStatus());

    }
    for (int i = 0; i < trees.size(); i++) {
      Tree actualTree = this.trees.get(i);
      System.out.println("The " + actualTree.getColor() + " " + actualTree.getClass().getSimpleName() + " " + actualTree.getWaterStatus());

    }
  }

  public void water(int waterAmount) {
    int counter = 0;
    for (int i = 0; i < flowers.size(); i++) {
      Flower actualFlower = this.flowers.get(i);
      if (actualFlower.getCurrentWaterAmount() < 5) {
        counter += 1;
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      Tree actualTree = this.trees.get(i);
      if (actualTree.getCurrentWaterAmount() < 10) {
        counter += 1;
      }
    }


    for (int i = 0; i < flowers.size(); i++) {
      Flower actualFlower = this.flowers.get(i);
      if (actualFlower.getCurrentWaterAmount() < 5) {
        actualFlower.setCurrentWaterAmount(waterAmount / counter);
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      Tree actualTree = this.trees.get(i);
      if (actualTree.getCurrentWaterAmount() < 10) {
        actualTree.setCurrentWaterAmount(waterAmount / counter);
      }
    }
  }
}
