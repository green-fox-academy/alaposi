import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int linesRows = 20;
        int x = 0;
        int y = 0;
        int lineLength = WIDTH / linesRows;
        int offset = lineLength / 16;
        int offset2 = 0;
        int offset3 = lineLength;


        for (int i = 0; i < linesRows; i++) {

            x = x + offset2;

            for (int j = 0; j < linesRows; j++) {
                for (int k = 0; k < 16; k++) {

                    graphics.setColor(new Color(75, 0, 130));
                    graphics.drawLine(x + k * offset, y + j * offset3, x + lineLength, y + offset + k * offset + j * offset3
                    );
                    graphics.setColor(Color.green);
                    graphics.drawLine(y + j * offset3, x + k * offset, y + offset + k * offset+ j*offset3, x + lineLength);

                }
            }

//            for (int j = 0; j < 16; j++) {
//                graphics.setColor(new Color(75, 0, 130));
//                graphics.drawLine(x + j * offset, y, x + lineLength, y + offset + j * offset);
//                graphics.setColor(Color.green);
//                graphics.drawLine(y, x + j * offset, y + offset + j * offset, x + lineLength);
//
//            }

            offset2 = lineLength;


        }

    }


    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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