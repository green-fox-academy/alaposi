package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

  private List<Animal> animals = new ArrayList<>();
  int placesForAnimals = 10;

  public void breed() {
    if (placesForAnimals > 0) {
      animals.add(new Animal());
      placesForAnimals -= 1;
    }
  }

  public void slaughter() {
    int indexOfMinimum = 0;
    int minimum = animals.get(0).getHunger();
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).getHunger() < minimum) {
        minimum = animals.get(i).getHunger();
        indexOfMinimum = i;
      }

    }
    animals.remove(indexOfMinimum);
  }


}
