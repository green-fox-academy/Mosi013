package userinput;


import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner sc = new Scanner(System.in);

    System.out.println("Give me your name!");
    String name = sc.nextLine();
    System.out.println("Hello " + name +"!");
  }
}