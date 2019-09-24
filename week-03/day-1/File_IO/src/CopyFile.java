import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    String inputFile = "my_file4.txt";
    String outputFile = "my_file3.txt";

    System.out.println(copyFile(inputFile, outputFile));

  }

  public static boolean copyFile(String file1, String file2) {

    try {
      Path filePath = Paths.get(file1);
      List<String> linesToCopy = Files.readAllLines(filePath);
      Path filePath2 = Paths.get(file2);
      Files.write(filePath2, linesToCopy);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
