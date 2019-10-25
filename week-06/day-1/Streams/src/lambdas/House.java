package lambdas;

import java.util.ArrayList;
import java.util.List;

public class House {

  private List<Room> rooms = new ArrayList<>();
  private String owner;

  public String getOwner() {
    return owner;
  }

  public House(String owner){
    this.owner = owner;
  }

  public void addRoom(Room room){
    rooms.add(room);
  }

  public List<Room> getRooms() {
    return rooms;
  }
}