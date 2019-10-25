package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Street {

  private List<House> houses = new ArrayList<>();
  private boolean isClosed = false;

  public boolean isClosed() {
    return isClosed;
  }

  public void addHouse(House house){
    houses.add(house);
  }

  public List<House> getHouses() {
    return houses;
  }
}