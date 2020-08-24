package exercise6;
//Write a Stream Expression to find the uppercase characters in a string!
public class Exercise6 {
  public static void main(String[] args) {
    String word = "aLmA vAgYoK";
    word.chars()
        .filter(Character::isUpperCase)
        .forEach(c -> System.out.println(Character.toString(c)));
  }
}
