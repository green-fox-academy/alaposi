package streams;

public class Student implements Comparable {

  private String name;
  private int age;
  private int points;

  public Student (String name, int age, int points){
    this.name = name;
    this.age = age;
    this.points = points;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getPoints() {
    return points;
  }

  @Override
  public String toString (){
    return name;
  }

  @Override
  public int compareTo(Object o) {
    return (this.points - ((Student)o).getPoints());
  }
}