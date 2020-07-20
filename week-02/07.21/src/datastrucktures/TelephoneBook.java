package datastrucktures;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  /*We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.

Create a map with the following key-value pairs.

Name (key)	Phone number (value)
William A. Lathan	405-709-1865
John K. Miller	402-247-8568
Hortensia E. Foster	606-481-6467
Amanda D. Newland	319-243-5613
Brooke P. Askew	307-687-2982
Create an application which solves the following problems.

What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number?*/
  public static void main(String[] args) {
    Map<String,String> telephoneBook = new HashMap<>();
    telephoneBook.put("William A. Lathan", "405-709-1865");
    telephoneBook.put("John K. Miller", "402-247-8568");
    telephoneBook.put("Hortensia E. Foster", "606-481-6467");
    telephoneBook.put("Amanda D. Newland", "319-243-5613");
    telephoneBook.put("Brooke P. Askew", "307-687-2982");

    System.out.println("What is John K. Miller's phone number?");
    System.out.println(telephoneBook.get("John K. Miller"));

    System.out.println("Whose phone number is 307-687-2982?");
    String keySearch = "";
    for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
      if (entry.getValue().equals("307-687-2982")) {
        keySearch = entry.getKey();
      }
    }
    System.out.println(keySearch);

    System.out.println("Do we know Chris E. Myers' phone number?");
    System.out.println(telephoneBook.containsKey("hris E. Myers"));
  }
}
