import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    String fileToDecrypt = "reversed-lines.txt";
    decrypt(fileToDecrypt);
  }

  public static void decrypt(String filename) {
    Path path = Paths.get(filename);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("File does not exist!");
    }

    List<String> newLines = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      StringBuilder sb = new StringBuilder(lines.get(i));
      newLines.add(sb.reverse().toString());
    }

    try {
      Files.write(path, newLines);
    } catch (IOException e) {
      System.out.println("File does not exist!");
    }
  }
}


// Create a method that decrypts reversed-lines.txt




