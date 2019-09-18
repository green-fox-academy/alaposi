import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        Random random = new Random();
        int randomNumber = random.nextInt(WIDTH);

//        int x = random.nextInt(WIDTH/3);
//        int y = random.nextInt(WIDTH/3);

//        for (int i = 0; i < 3; i++) {
//            drawSingleLine(x * i, y * i, graphics);
//        }

        for (int i = 0; i < random.nextInt(100); i++) {
            drawSingleLine(random.nextInt(WIDTH), random.nextInt(WIDTH), graphics);
        }
    }


    public static void drawSingleLine(int start1, int start2, Graphics graphics) {
        graphics.drawLine(start1, start2, WIDTH / 2, HEIGHT / 2);
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