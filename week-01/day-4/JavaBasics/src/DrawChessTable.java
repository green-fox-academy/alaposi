public class DrawChessTable {
  public static void main(String[] args) {
    int lines = 8;
    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < 4; j++) {
        if (i % 2 == 0) {
          System.out.print("% ");
        } else {
          System.out.print(" %");
        }
      }
      System.out.println();
    }

  }
}


// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

