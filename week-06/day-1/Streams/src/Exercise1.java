import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> evenNumbers = numbers.stream()
        .filter(x -> x % 2 == 0)
        .collect(Collectors.toList());

  }
}


//  Write a Stream Expression to get the even numbers from the following list:
//    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

//    List<Integer> evenNumbers = new ArrayList<>();
//    numbers.stream().filter(x -> x % 2 == 0).forEach(x -> evenNumbers.add(x));