package greenfoxorganization;

public class Sponsor extends Person{
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super("Jane Doe", 30, "female");
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old "
        + getGender() + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
  }

  public void hire(){
    this.hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}