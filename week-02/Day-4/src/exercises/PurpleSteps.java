package exercises;
import java.util.PrimitiveIterator;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
    drawSquare(graphics);
    drawSquare2(graphics);
  }

  private static void drawSquare(Graphics graphics){
    int size = 15;
  int x = 0;
  int y = 0;
    for (int i = 0; i < 40; i++) {
    graphics.setColor(Color.ORANGE);
    graphics.fillRect(x, y, size, size);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, size, size);
    x += size;
    y += size;
  }
}

  private static void drawSquare2(Graphics graphics){
    int size = 15;
    int x = 0;
    int y = 600;
    for (int i = 0; i < 40; i++) {
      graphics.setColor(Color.RED);
      graphics.fillRect(x, y, size, size);
      graphics.setColor(Color.BLACK);
      graphics.drawRect(x, y, size, size);
      x += size;
      y -= size;
    }
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