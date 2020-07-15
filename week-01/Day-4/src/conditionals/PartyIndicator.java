package conditionals;

import java.util.Scanner;

public class PartyIndicator {

// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me number of chicks");
    int chicks = sc.nextInt();
    System.out.println("Give me number of boiz");
    int boiz = sc.nextInt();
    int allOfThem = chicks + boiz;

    if (chicks == boiz && allOfThem >= 20) {
      System.out.println("The party is excellent!");
    } else if (boiz == 1 && chicks > 5) {
      System.out.println("PlayBoy");
    } else if (allOfThem >= 20 && boiz != chicks) {
      System.out.println("Quite cool party!");
    } else if (allOfThem < 20) {
      System.out.println("Average party...");
    } else if (chicks == 0) {
      System.out.println("Sausage party");
    }
  }
}
