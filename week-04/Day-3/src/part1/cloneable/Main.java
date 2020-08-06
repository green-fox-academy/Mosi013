package part1.cloneable;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("John", 20, "male", "BME");
    Student jonhTheClone = new Student();

    try {
      jonhTheClone = student.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    System.out.println(jonhTheClone.getName() + " " + jonhTheClone.getAge() + " " + jonhTheClone.getGender() + " " + jonhTheClone.getPreviousOrganization());
  }
}
