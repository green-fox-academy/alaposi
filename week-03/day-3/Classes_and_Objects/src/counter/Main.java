package counter;

public class Main {
  public static void main(String[] args) {

    Counter count = new Counter(10);

    count.add(10);

    count.add();

    System.out.println(count.get());

    count.reset();

    System.out.println(count.get());



  }
}
