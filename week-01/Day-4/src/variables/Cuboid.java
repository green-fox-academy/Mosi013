package variables;

import java.util.Scanner;

public class Cuboid {
  // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("a = ");
    int a = sc.nextInt();
    System.out.println("b = ");
    int b = sc.nextInt();
    System.out.println("c = ");
    int c = sc.nextInt();
    System.out.println(a + " , " + b + " , " + c);

    int surfaceArea = (2 * a * b) + (2 * b * c) + (2 * a * c);
    int volume = a * b * c;

    System.out.println("Surface area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
}
