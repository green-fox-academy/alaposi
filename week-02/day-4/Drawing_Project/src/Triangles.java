import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {

    int heightOfTr = 15;
    int widthOfTr = 16;
    int maxLines = 18;
    
    int lines = 1;
    int width = 1;
    // x points : 160, 168, 152;
    int xpoints[] = {(WIDTH / 2), (WIDTH / 2 + widthOfTr / 2), (WIDTH / 2 - widthOfTr / 2)};
    // y points : 0, 15, 15;
    int ypoints[] = {0, heightOfTr, heightOfTr};

    graphics.drawPolygon(xpoints, ypoints, 3);
    for (int i = 0; i < maxLines; i++) {
      xpoints[0] -= widthOfTr / 2 * width;
      xpoints[1] -= widthOfTr / 2 * width;
      xpoints[2] -= widthOfTr / 2 * width;
      ypoints[0] += heightOfTr;
      ypoints[1] += heightOfTr;
      ypoints[2] += heightOfTr;
      graphics.drawPolygon(xpoints, ypoints, 3);
      for (int j = 0; j < lines; j++) {
        xpoints[0] += widthOfTr;
        xpoints[1] += widthOfTr;
        xpoints[2] += widthOfTr;
        graphics.drawPolygon(xpoints, ypoints, 3);
      }
      width += 2;
      lines += 1;
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
