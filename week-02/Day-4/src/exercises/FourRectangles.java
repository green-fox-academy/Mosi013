package exercises;
import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.
    for (int i = 0; i < 4; i++) {
      graphics.setColor(getRandomColor());
      graphics.fillRect(randomNumber(),randomNumber(),randomNumber(),randomNumber());
    }



  }

  private static int randomNumber(){
    Random random = new Random();
    int limit = HEIGHT;
    return random.nextInt(limit);
  }

  public static Color getRandomColor() {
    Random random = new Random();
    int limit = 256;
    return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
  }

  private static int[] randomXCoor() {
    int[] xCoor = new int[3];
    for (int i = 0; i < xCoor.length; i++) {
      xCoor[i] = (int) (Math.random() * HEIGHT);
    }
    return xCoor;
  }

  private static int[] randomYCoor(){
    int[] yCoor = new int[3];
    for (int i = 0; i < yCoor.length; i++) {
      yCoor[i] = (int) (Math.random() * HEIGHT);
    }
    return yCoor;
  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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