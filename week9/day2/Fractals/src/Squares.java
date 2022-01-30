import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void squaresFractal(Graphics g,double x,double y , double width){

        g.drawRect((int) (x+width/3),(int)(y+width/3),(int)width/3,(int)width/3);
        g.drawRect((int)x,(int)(y + width/3),(int)width/3,(int)width/3);
        g.drawRect((int)(x+width/3*2),(int)(y+width/3),(int)width/3,(int)width/3);
        g.drawRect((int)(x+width/3),(int)y,(int)width/3,(int)width/3);
        g.drawRect((int)(x+width/3), (int)(y+width/3*2),(int)width/3,(int)width/3);

        width = width/3;

        if (width>10){
            squaresFractal(g,x+width,y,width);
            squaresFractal(g,x,y+width,width);
            squaresFractal(g,x+width,y + width*2,width);
            squaresFractal(g,x+width*2,y+width,width);
        }





    }


    public static void drawImage(Graphics g){
        squaresFractal(g,0,0,WIDTH);
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
