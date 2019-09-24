import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

    String fileName = "my_filee.txt";

    lineCount(fileName);

  }

  public static void lineCount(String fname) {
    int count = 0;
    try {
      Path filePath = Paths.get(fname);
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(count = lines.size());
    } catch (Exception e) {
      System.out.println("zero");
    }
  }
}

