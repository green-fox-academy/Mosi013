package part1.cloneable;

public class Student extends Person implements java.lang.Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super("Jane Doe", 30, "female");
    this.previousOrganization = "The School of Life,";
    this.skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + name + " year old " +
        gender + "from " + this.previousOrganization +
        " who skipped " + this.skippedDays
        + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
    age
  }

  public void increaseAge(int yearIncrement) {
    setAge(getAge() += yearIncrement );
    this.age+= yearIncrement;
    super.name = name;
  }


  @Override
  public Student clone() throws CloneNotSupportedException {
    Student clone = (Student) super.clone();
    return clone;
  }
}
