import java.util.ArrayList;

public class MatRev {

  public int marciSumFunction(ArrayList<Integer> listToSum) {
    int sum = 0;
    for (int i = 0; i < listToSum.size(); i++) {
      sum += listToSum.get(i);
    }
    return sum;

  }

}
