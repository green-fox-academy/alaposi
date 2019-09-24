import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    String input = "duplicated-chars.txt";
    String output = "decrypted.txt";

    decryption(input, output);
  }

  public static void decryption(String fileName1, String fileName2) {
    try {
      Path filePath = Paths.get(fileName1); //eredeti file helye
      List<String> text = Files.readAllLines(filePath); //szöveg az eredeti fileból
      Path filePath2 = Paths.get(fileName2);  //új file
      List<String> newText = new ArrayList<>(); //új file tartalma

      for (int i = 0; i < text.size(); i++) {
        String line = text.get(i);
        String newLine = "";

        for (int j = 0; j < line.length(); j += 2) {
          newLine = newLine + line.charAt(j);
        }
        newText.add(newLine);
      }
      Files.write(filePath2, newText);
      System.out.println("successfully decrypted");

    } catch (Exception e) {
      System.out.println("file could not be decrypted");
    }
  }
}
