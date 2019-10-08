import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    String filePath = "log.txt";
    getIPAddresses(filePath);
    System.out.println(getRatioOfGetPost(filePath));

  }

  public static String[] getIPAddresses(String filePath) {
    List<String> ipAddresses = new ArrayList<>();
    Path path = Paths.get(filePath);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("file cannot be found");
    }

    for (int i = 0; i < lines.size(); i++) {
      String[] singleLine = lines.get(i).replace("   ", "  ").replace("  ", " ").split(" ");
      String ipToAdd = singleLine[5];
      if (!ipAddresses.contains(ipToAdd)) {
        ipAddresses.add(ipToAdd);
      }
    }

    String[] ipAddressArray = ipAddresses.toArray(new String[0]);
    return ipAddressArray;
  }

  public static double getRatioOfGetPost(String filePath) {
    Path path = Paths.get(filePath);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("file cannot be found");
    }

    double counterGet = 0;
    double counterPost = 0;
    double ratioGetPerPost;
    for (int i = 0; i < lines.size(); i++) {
      String[] singleLine = lines.get(i).replace("   ", "  ").replace("  ", " ").split(" ");
      String status = singleLine[6];
      if (status.equals("GET")) {
        counterGet++;
      } else if (status.equals("POST")) {
        counterPost++;
      }
    }
    ratioGetPerPost = counterGet / counterPost;
    return ratioGetPerPost;
  }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.