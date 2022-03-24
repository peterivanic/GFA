import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[] box = new int[]{10, 10, 290, 10, 290, 290, 10, 290};
        int[] object = new int[]{50, 100, 50, 100, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100};
        conect(graphics, object);

    }

    public static void conect(Graphics graphics, int[] coordinates) {
        List<Integer> pX = new ArrayList<>();
        List<Integer> py = new ArrayList<>();
        int j = 0;
        for (int i : coordinates) {
            if (j % 2 == 0) {
                pX.add(i);
            } else {
                py.add(i);
            }
            j++;
        }
        int[] pointX = pX.stream().mapToInt(i -> i).toArray();
        int[] pointY = py.stream().mapToInt(i -> i).toArray();
        graphics.drawPolygon(pointX, pointY, coordinates.length / 2);
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
