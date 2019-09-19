import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int size = WIDTH / 10;
    int offset1 = 0;
    int offset2 = 0;

    for (int i = 0; i < WIDTH / size; i++) {
      for (int j = 0; j < WIDTH / size; j++) {

        if (i % 2 == 0 && j % 2 != 0) {
          graphics.setColor(Color.black);
          graphics.fillRect(offset1 + i * size, offset2 + j * size, size, size);
          graphics.drawRect(offset1 + i * size, offset2 + j * size, size, size);
        } else {
          graphics.setColor(Color.black);
          graphics.drawRect(offset1 + i * size, offset2 + j * size, size, size);
        }

        if (i % 2 != 0 && j % 2 == 0) {
          graphics.setColor(Color.black);
          graphics.fillRect(offset1 + i * size, offset2 + j * size, size, size);
          graphics.drawRect(offset1 + i * size, offset2 + j * size, size, size);
        } else {
          graphics.setColor(Color.black);
          graphics.drawRect(offset1 + i * size, offset2 + j * size, size, size);
        }
      }
    }

    //      for (int i = 0; i < WIDTH/size; i++) {
    //          for (int j = 0; j < WIDTH/size; j++) {
    //
    //              if (i == j) {
    //                  graphics.setColor(Color.black);
    //                  graphics.fillRect(offset1 + i * size, offset2 + j * size, size, size);
    //                  graphics.drawRect(offset1 + i * size, offset2 + j * size, size, size);
    //              } else {
    //                  graphics.setColor(Color.black);
    //                  graphics.drawRect(offset1 + i * size, offset2 + j * size, size, size);
    //              }
    //          }
    //      }
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
