import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopStar {
    public static void mainDraw(Graphics graphics) {

        int lineLength = WIDTH / 2;
        int offset = lineLength / 16;
        int[]center = {(WIDTH / 2), (HEIGHT / 2)};
        //int[] center = {160, 160};
        int x2 = WIDTH / 2;
        int y2 = 0;

        for (int i = 0; i < lineLength / offset; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(center[0] + i * offset, center[1], x2, y2 + i * offset);
        }
        for (int i = 0; i < lineLength / offset; i++) {
            graphics.setColor(Color.green);
            //change x1 offset
            graphics.drawLine(center[0] - i * offset, center[1], x2, y2 + i * offset);
        }

        y2 = HEIGHT;

        for (int i = 0; i < lineLength / offset; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(center[0] + i * offset, center[1], x2, y2 - i * offset);
        }
        for (int i = 0; i < lineLength / offset; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(center[0] - i * offset, center[1], x2, y2 - i * offset);
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