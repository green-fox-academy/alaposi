import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int x = 50;
        int y = 10;
        int lineLength = 260;
        int offset = 20;


        for (int i = 0; i < 13; i++) {
            graphics.setColor(new Color(75, 0, 130));
            graphics.drawLine(x + i * offset, y, x + lineLength, y + offset + i * offset);
        }

        for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(y, x + i * offset, y + offset + i * offset, x + lineLength);
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
