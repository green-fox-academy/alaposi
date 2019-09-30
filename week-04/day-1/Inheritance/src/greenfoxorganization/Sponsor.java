package greenfoxorganization;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + super.getName()+ ", a " + super.getAge() + " year old " + super.getGender() + " who represents " + company + " and hired "  + hiredStudents + " so far." );
  }

  public void hire(){
    hiredStudents +=1;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;

  }
}
