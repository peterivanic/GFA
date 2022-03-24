import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        int count = 10 + (int) (Math.random() * 20);

        for (int i = 0; i < count ; i++) {
            int size = 10 + (int) (Math.random() * 10);
            int r1 = 10 + (int) (Math.random() * 270);
            int r2 = 10 + (int) (Math.random() * 270);
            int color = 1 + (int) (Math.random() * 4);
            switch (color) {
                case 2 -> graphics.setColor(new Color(180, 180, 174));
                case 3 -> graphics.setColor(new Color(232, 232, 230));
                case 4 -> graphics.setColor(new Color(70, 70, 69));
                case 5 -> graphics.setColor(new Color(129, 129, 123));
            }
            graphics.fillRect(r1,r2,size,size);
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
        panel.setBackground(Color.black);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
