package exercises;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    drawToCenter(0,0,graphics);
  }

  private static void drawToCenter(int xCoor, int yCoor, Graphics graphics) {
    int pxSpace = 20;
    while (xCoor <= WIDTH){
      drawLine(xCoor,yCoor,graphics);
        xCoor = xCoor + pxSpace;
      }

      while (yCoor <= HEIGHT){
        drawLine(xCoor,yCoor,graphics);
        yCoor = yCoor + pxSpace;
      }
    while (xCoor >= 0){
      drawLine(xCoor,yCoor,graphics);
      xCoor = xCoor - pxSpace;
    }

    while (yCoor >= 0){
      drawLine(xCoor,yCoor,graphics);
      yCoor = yCoor - pxSpace;
    }
  }

  private static void drawLine(int x, int y, Graphics graphics){
    graphics.drawLine(x, y, WIDTH /2, HEIGHT / 2);
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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