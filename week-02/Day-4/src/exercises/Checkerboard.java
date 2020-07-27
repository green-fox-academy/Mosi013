package exercises;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    drawChechkerBoard(graphics);


  }

  private static void drawChechkerBoard(Graphics graphics) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if ((i + j) % 2 == 0) {
          graphics.setColor(Color.ORANGE);
        } else {
          graphics.setColor(Color.WHITE);
        }
        graphics.fillRect(i * WIDTH / 8, j * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(i * WIDTH / 8, j * HEIGHT / 8, WIDTH / 8, HEIGHT / 8);

      }
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