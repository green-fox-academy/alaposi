import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    String filePath = "reversed-order.txt";
    reverseOrder(filePath);
  }

  public static void reverseOrder(String filePath) {
    Path path = Paths.get(filePath);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("file cannot be found");
    }

    List<String> newLines = new ArrayList<>();
    for (int i = lines.size(); i > 0; i--) {
      newLines.add(lines.get(i - 1));
    }

    try {
      Files.write(path, newLines);
    } catch (IOException e) {
      System.out.println("file cannot be found");
    }
  }
}
