import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3dAdvanced {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

    int sideOfSquare = 10;
    int offset = 10;

    for (int i = 0; i < 6; i++) {

      graphics.setColor(new Color(177, 69, 243));
      graphics.fillRect(
          offset + sideOfSquare * i,
          offset + sideOfSquare * i,
          sideOfSquare * (i + 1),
          sideOfSquare * (i + 1));

      graphics.setColor(new Color(75, 0, 130));
      graphics.drawRect(
          offset + sideOfSquare * i,
          offset + sideOfSquare * i,
          sideOfSquare * (i + 1),
          sideOfSquare * (i + 1));

      offset = offset + sideOfSquare * i;
    }
  }

  // Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

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
