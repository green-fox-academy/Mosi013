package exercises;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 2 parameters:
    // An array of {x, y} points and graphics
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
    int[][] coordinatesOfArray = {
        {10, 10},
        {290, 10},
        {290, 290},
        {10, 290}};
    int[][] coordinatesOfArray2 = {
        {50, 100},
        {70, 70},
        {80, 90},
        {90, 90},
        {100, 70},
        {120, 100},
        {85, 130},
        {50, 100}};
    connectDotsFunction(coordinatesOfArray, graphics);
    connectDotsFunction(coordinatesOfArray2, graphics);

  }

  public static void connectDotsFunction(int[][] coordinatesArray, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    for (int i = 1; i < coordinatesArray.length; i++) {
      graphics.drawLine(coordinatesArray[i - 1][0], coordinatesArray[i - 1][1], coordinatesArray[i][0], coordinatesArray[i][1]);
    }
    graphics.drawLine(coordinatesArray[coordinatesArray.length - 1][0], coordinatesArray[coordinatesArray.length - 1][1], coordinatesArray[0][0], coordinatesArray[0][1]);
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