package homework;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Tree {
  private String type;
  private String leafColor;
  private int age;
  private String sex;
  private List<Tree> trees;
  //This. éppen az aktuális objektumra mutat
  public Tree(String type, String leafColor, int age, String sex) {
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;
  }

  public Tree(String type, String leafColor, String sex){
    this(type, leafColor, 0, sex);    //Így elkerüljük a kód duplikációt
  }                                   //és meghívjuk a konstruktórból a konstruktort

  public void grow(){
    this.age++;
  }

  public String getType() {
    return type;
  }

  public String getLeafColor() {
    return leafColor;
  }

  public int getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public List<Tree> getTrees() {
    return trees;
  }


}
