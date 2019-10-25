package lambdas;

public class Room {
  private String name;
  private boolean shelvesAreClean;
  private boolean booksAreSorted;
  private boolean carpetIsClean;
  private boolean tableIsClean;
  private boolean airIsFresh;

  public Room (String name){
    this.name = name;
  }

  //region Cleaning methods
  public void cleanShelves() {
    shelvesAreClean = true;
  }

  public void sortBooks() {
    booksAreSorted = true;
  }

  public void cleanCarpet() {
    carpetIsClean = true;
  }

  public void cleanTable() {
    tableIsClean = true;
  }

  public void refreshAir() {
    airIsFresh = true;
  }
  //endregion

  //region Getters
  public String getName() {
    return name;
  }

  public boolean isCarpetClean() {
    return carpetIsClean;
  }

  public boolean isTableClean() {
    return tableIsClean;
  }

  public boolean isAirFresh() {
    return airIsFresh;
  }

  public boolean areShelvesClean() {
    return shelvesAreClean;
  }

  public boolean isBooksAreSorted() {
    return booksAreSorted;
  }
  //endregion

  @Override
  public String toString(){
    String happy = ":-)";
    String unhappy = "#messy#";
    String shelfStatus =  " Shelves " + (shelvesAreClean ?  happy : unhappy) +'\n';
    String bookStatus = " Books " + (booksAreSorted ?  happy : unhappy) +'\n';
    String carpetStatus = " Carpet " + (carpetIsClean ?  happy : unhappy) +'\n';
    String tableStatus = " Table " + (tableIsClean ? happy : unhappy) +'\n';
    String airStatus = " Air " + (airIsFresh ? happy : unhappy) +'\n';

    return name + " looks: \n" + shelfStatus + bookStatus + carpetStatus + tableStatus + airStatus;
  }
}