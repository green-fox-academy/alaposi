package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class District {

  private List<Street> streets = new ArrayList<>();

  public District() {
    initializeData();
  }

  private void initializeData(){
    Street firstStreet = new Street();
    Street secondStreet = new Street();
    Street thirdStreet = new Street();

    House firstHouse = new House("Kovácsék");
    firstHouse.addRoom(new Room("Nappali"));
    firstHouse.addRoom(new Room("Dolgozó"));

    House secondHouse = new House("Szabóék");
    secondHouse.addRoom(new Room("Nappali"));
    secondHouse.addRoom(new Room("Háló"));

    House fourthHouse = new House("Benedekék");
    fourthHouse.addRoom(new Room("Gyerekszoba"));
    fourthHouse.addRoom(new Room("Nappali"));
    fourthHouse.addRoom(new Room("Vendégszoba"));

    House fifthHouse = new House("Ravaszék");
    fifthHouse.addRoom(new Room("Büntetőszoba"));

    firstStreet.addHouse(firstHouse);
    firstStreet.addHouse(secondHouse);

    thirdStreet.addHouse(fourthHouse);
    thirdStreet.addHouse(fifthHouse);

    streets.add(firstStreet);
    streets.add(secondStreet);
    streets.add(thirdStreet);
  }

  public void report(String message){
    System.out.println();
    System.out.println(message);

    for (Street street : streets) {
      for (House house : street.getHouses() ) {
        System.out.println("Status of " + house.getOwner());
        for (Room room : house.getRooms()){
          System.out.println(room);
        }
      }
    }
  }

  // clean requested things that require cleaning (without functional interfaces)
  public void clean(boolean cleanShelves, boolean sortBooks, boolean cleanCarpet, boolean cleanTable, boolean refreshAir){
    for (Street street : streets ) {
      if (!street.isClosed()){
        for (House house: street.getHouses()) {
          for (Room room : house.getRooms()) {
            if (cleanShelves){
              if (!room.areShelvesClean()){
                room.cleanShelves();
              }
            }
            if (sortBooks){
              if (!room.isBooksAreSorted()){
                room.sortBooks();
              }
            }
            if (cleanCarpet){
              if (!room.isCarpetClean()){
                room.cleanCarpet();
              }
            }
            if (cleanTable){
              if (!room.isTableClean()){
                room.cleanTable();
              }
            }
            if (refreshAir){
              if (!room.isAirFresh()){
                room.refreshAir();
              }
            }
          }
        }
      }
    }
  }

  // alternative: public void clean(Predicate<Room> roomCondition, Consumer<Room> process){

  //       (Predicate<Room> milyen feltétel esetén, mit akarok csinálni)
  public void clean(Predicate<Room> roomCondition, Cleanable process){
    for (Street street : streets ) {
      if (!street.isClosed()){
        for (House house: street.getHouses()) {
          for (Room room : house.getRooms()) {
            if (!roomCondition.test(room)){
              process.clean(room);
            }
          }
        }
      }
    }
  }
}