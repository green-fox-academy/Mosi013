package homework;

import java.awt.Color;

public class Forest {
  public static void main(String[] args) {
    Tree tree1 = new Tree("Oak", "Green", 30, "male");
    Tree tree2 = new Tree("Redwood", "Red", 100, "female");
    Tree tree3 = new Tree("Beech", "Green", 20, "male");
    Tree tree4 = new Tree("Sequoia", "Green", 140, "male");
    Tree tree5 = new Tree("Palm", "Green", 40, "female");


    tree1.grow();
    System.out.println(tree1.getType());
    System.out.println(tree1.getLeafColor());
    System.out.println(tree1.getAge());
    System.out.println(tree1.getSex());
  }
}
