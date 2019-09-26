package classdemo;

public class ZigZagStudent {

  //fields  -milyen változói lehetnek
  String name;
  int phase;
  int codeMasterPoints;

  static int numberOfDNAPairs = 23;  //static - állandó érték, class-hoz tartozik,
  // nem az instance-hoz


  //constructors
  public ZigZagStudent() {
  }

  //konstruktor - a neve megegyezik a class nevével
  // nem kell static és void
  // A konstruktor csak arra való, hogy létrehozza és beállítsa az instance-ot,
  // más dolgokat (pl print) nem írunk bele.
  // ha nincs beleírva semmi a konstrukroba, akkor a default érvényes

  public ZigZagStudent(String studentName) {
    if (studentName.startsWith("Dr.")) {
      studentName = "Dr." + studentName;
    }
    name = studentName.toUpperCase();
  }



  // A this a class name-re utal (a this a tulajdonképpen that :)).
  // A this a névütközés elkerülésére való, ha különböző nevet használok, akkor nem
  // kell a this

  public ZigZagStudent(String studentName, int phase) {
    this(studentName);  //másik konstruktort tud hívni
    this.phase = phase;
  }

  public ZigZagStudent(String studentName, int phase, int codeMasterPoints) {
    this(studentName, phase);
    //this.name = studentName.toUppercase();
    //this.phase = phase;
    this.codeMasterPoints = codeMasterPoints;
  }


  // functions  (hozzá lehet rendelni function-t is)
  public String introduce() {
    return "Hi, my name is " + name + ", I am in " + phase + " phase and I have " + codeMasterPoints + " points.";
  }

  public void askQuestions() {
    codeMasterPoints += 30;
  }

  public void watchVideos(int numberOfVideos, boolean isBanaVideo) {
    int extra = isBanaVideo ? 2 : 4;  //  ha igaz, akkor 2; ha nem igaz, akkor 4;
    codeMasterPoints += (numberOfVideos * 20) + extra;
  }

  public void doExam(boolean successful) {
    codeMasterPoints = successful ? 30 : 70;
    if (successful) {
      phase++;
    }
  }


}
