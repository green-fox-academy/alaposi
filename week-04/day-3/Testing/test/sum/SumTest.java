package sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum = new Sum();

  @Test
  public void sumFunction_MultipleElements() {
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(3, 5, 10));
    int result = sum.sumFunction(test);
    assertEquals(18, result);
  }

  @Test
  public void sumFunction_EmptyList() {
    ArrayList<Integer> test2 = new ArrayList<>();
    int result = sum.sumFunction(test2);
    assertEquals(0, result);
  }

  @Test
  public void sumFunction_OneElement() {
    ArrayList<Integer> test3 = new ArrayList<>(Arrays.asList(5));
    int result = sum.sumFunction(test3);
    assertEquals(5, result);
  }

  @Test
  public void sumFunction_Null() {
    ArrayList<Integer> test4 = new ArrayList<>();
    Integer result = null;
    assertEquals(null, result);
  }
}