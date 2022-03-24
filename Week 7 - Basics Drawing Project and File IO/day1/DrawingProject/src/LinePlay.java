import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {


        for (int i = 1; i < 16; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(10,HEIGHT -i*20,WIDTH -i*20,HEIGHT-10);

        }
        for (int i = 1; i < 16; i++) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(HEIGHT -i*20,10,HEIGHT-10,WIDTH -i*20);

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
