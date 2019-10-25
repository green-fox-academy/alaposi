package lambdas;

// Create an application that simulates the cleaning process for a district
// One team develops the logistics - how the cleaner team gets to plpaces (rooms) to clean
// Another team develops the logic for cleaning itself

public class CleaningApplication {

  public static void main(String[] args) {
    District district = new District();

    district.report("Before first cleaning");

    // Original logic
    //district.clean(true, false, false, false, false);

    // Updated logic:
   district.clean(room -> room.areShelvesClean(),
        r -> r.cleanShelves());
    district.report("After first cleaning");

    district.clean(room -> room.isCarpetClean() , room -> room.cleanCarpet());

    district.report("After second cleaning");
  }
}