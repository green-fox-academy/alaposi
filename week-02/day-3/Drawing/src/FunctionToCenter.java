import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int inputX = 0;
    int inputY = 0;
    int stepSize = 20;

    for (int i = 0; i < WIDTH; i += stepSize) {
      inputX = i;
      toCenter(inputX, inputY, graphics);
    }

    for (int i = 0; i < WIDTH; i += stepSize) {
      inputX = i;
      inputY = HEIGHT;
      toCenter(inputX, inputY, graphics);
    }

    for (int i = 0; i < HEIGHT; i += stepSize) {
      inputY = i;
      inputX = 0;
      toCenter(inputX, inputY, graphics);
    }

    for (int i = 0; i <= HEIGHT; i+= stepSize) {
      inputX = WIDTH;
      inputY = i;
      toCenter(inputX, inputY, graphics);
    }
  }

  public static void toCenter(int input1, int input2, Graphics graphics) {
    graphics.drawLine(input1, input2, WIDTH / 2, HEIGHT / 2);
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
