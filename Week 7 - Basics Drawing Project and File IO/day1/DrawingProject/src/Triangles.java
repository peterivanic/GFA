import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {

        for (int i = 0; i < 20; i++) {
            graphics.drawLine(WIDTH/2-i*5,HEIGHT/3+i*10,WIDTH/2+i*5,HEIGHT/3+i*10);
        }
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(WIDTH/2+i*5,HEIGHT/3+i*10,WIDTH/5+i*10,HEIGHT-25);
        }
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(WIDTH/2-i*5,HEIGHT/3+i*10,WIDTH-65-i*10,HEIGHT-25);
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
            drawImage(graphics);
        }
    }
}

