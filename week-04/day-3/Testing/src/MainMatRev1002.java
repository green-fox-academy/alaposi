import java.util.ArrayList;

public class MainMatRev1002 {
  public static void main(String[] args) {

    ArrayList<Integer> marciListaja = new ArrayList<>();
    marciListaja.add(3);
    marciListaja.add(170);
    marciListaja.add(9);

    MatRev matrev = new MatRev();
    System.out.println(matrev.marciSumFunction(marciListaja));

  }
}


