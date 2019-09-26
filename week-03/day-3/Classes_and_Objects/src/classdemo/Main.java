package classdemo;

public class Main {
  public static void main(String[] args) {

    ZigZagStudent firstStudent = new ZigZagStudent("Géza");  //instance
    ZigZagStudent secondStudent = new ZigZagStudent("Sanyi", 1, 120);

    //firstStudent.codeMasterPoints = 20;
    //firstStudent.name = "Géza";
    //firstStudent.phase = 1;

    String intruduction = secondStudent.introduce();
    System.out.println(intruduction);

    secondStudent.askQuestions();
    intruduction = secondStudent.introduce();
    System.out.println(intruduction);

    //ZigZagStudent.numberOfDNAPairs

    int pairs = ZigZagStudent.numberOfDNAPairs;
    //pairs = firstStudent.getPairs();   // sign of the sith!!! ne csináld ilyet!
  }
}

