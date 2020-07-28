import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    drawRightSide(10, 20, graphics);
    }



  private static void drawRightSide(int yCoor, int px, Graphics graphics) {
    while (px <= HEIGHT){
    drawALine(graphics, yCoor, px);
    yCoor = yCoor + px;
    }
  }

  private static void drawALine(Graphics graphics, int y, int px) {
    graphics.setColor(Color.RED);
    graphics.drawLine(0, y, WIDTH, HEIGHT / px);
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