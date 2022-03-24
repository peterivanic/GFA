import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        for (int i = 7; i >=1; i--) {

            switch (i) {
                case 1 -> graphics.setColor(Color.red);
                case 2 -> graphics.setColor(Color.orange);
                case 3 -> graphics.setColor(Color.yellow);
                case 4 -> graphics.setColor(Color.green);
                case 5 -> graphics.setColor(Color.blue);
                case 6 -> graphics.setColor(new Color(75, 0, 130));
                case 7 -> graphics.setColor(new Color(127, 0, 255));
            }
            square(graphics,graphics.getColor(),i*45);

        }
    }

    public static void square(Graphics graphics, Color color,int size){
        int positionX = HEIGHT/2 - size/2;
        int positiony = WIDTH/2 - size/2;
        graphics.fillRect(positionX,positiony,size,size);
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