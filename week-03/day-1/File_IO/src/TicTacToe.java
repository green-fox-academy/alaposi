import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

   // System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"
   // System.out.println(ticTacResult("win.txt"));
     System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"
    // System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String fileName) {
    Path path = Paths.get(fileName);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("File does not exist!");
    }
    int n = lines.size();
    char[][] matrix = new char[n][n];
    for (int i = 0; i < n; i++) {
      char[] line = lines.get(i).toLowerCase().toCharArray();
      for (int j = 0; j < n; j++) {
        matrix[i][j] = line[j];
      }
    }
    char winner = 0;

    int counter = 1;
    for (int i = 0; i < n - 1; i++) {
      if (matrix[i][n - 1 - i] == matrix[i + 1][n - 2 - i]) {
        counter++;
        if (counter == n) {
          winner = matrix[i][n - 1 - i];
          return String.valueOf(winner);
        }
      } else break;
    }
    counter = 1;
    for (int i = 0; i < n - 1; i++) {
      if (matrix[i][i] == matrix[i + 1][i + 1]) {
        counter++;
        if (counter == n) {
          winner = matrix[i][i];
          return String.valueOf(winner);
        }
      } else break;
    }
    for (int i = 0; i < n; i++) {
      counter = 1;
      for (int j = 0; j < n - 1; j++) {
        if (matrix[i][j] == matrix[i][j + 1]) {
          counter++;
          if (counter == n) {
            winner = matrix[i][j + 1];
            return String.valueOf(winner);
          }
        } else break;
      }
    }
    for (int i = 0; i < n; i++) {
      counter = 1;
      for (int j = 0; j < n - 1; j++) {
        if (matrix[j][i] == matrix[j + 1][i]) {
          counter++;
          if (counter == n) {
            winner = matrix[i][j + 1];
            return String.valueOf(winner);
          }
        } else break;
      }
    }
    return "Draw";
  }
}


//
//    if(matrix[0][0] == 'O' && matrix[0][1] == 'O'  && matrix[0][2] == 'O' ||
//        matrix[1][0] == 'O' && matrix[1][1] == 'O'  && matrix[1][2] == 'O' ||
//        matrix[2][0] == 'O' && matrix[2][1] == 'O'  && matrix[2][2] == 'O' ||
//        matrix[0][0] == 'O' && matrix[1][0] == 'O'  && matrix[2][0] == 'O' ||
//        matrix[0][1] == 'O' && matrix[1][1] == 'O'  && matrix[2][1] == 'O' ||
//        matrix[0][2] == 'O' && matrix[1][2] == 'O'  && matrix[2][2] == 'O' ||
//        matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O' ||
//        matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
//        return "O";
//        } else if (matrix[0][0] == 'X' && matrix[0][1] == 'X'  && matrix[0][2] == 'X' ||
//        matrix[1][0] == 'X' && matrix[1][1] == 'X'  && matrix[1][2] == 'X' ||
//        matrix[2][0] == 'X' && matrix[2][1] == 'X'  && matrix[2][2] == 'X' ||
//        matrix[0][0] == 'X' && matrix[1][0] == 'X'  && matrix[2][0] == 'X' ||
//        matrix[0][1] == 'X' && matrix[1][1] == 'X'  && matrix[2][1] == 'X' ||
//        matrix[0][2] == 'X' && matrix[1][2] == 'X'  && matrix[2][2] == 'X' ||
//        matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X' ||
//        matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
//        return "X";
//        } else {
//        return "Draw";
//        }