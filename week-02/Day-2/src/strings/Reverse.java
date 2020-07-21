package strings;

public class Reverse {
  public static void main(String... args) {
    String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(reverse(toBeReversed));
    System.out.println(reverse2(toBeReversed));
  }

  public static String reverse(String word) {
    String rev = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      rev = rev + word.charAt(i);
    }


    return rev;
  }

  public static String reverse2(String word){
    StringBuffer buffer = new StringBuffer(word);
    buffer.reverse();
    return buffer.toString();

  }
}