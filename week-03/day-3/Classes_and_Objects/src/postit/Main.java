package postit;

public class Main {
  public static void main(String[] args) {

    PostIt first = new PostIt("orange", "blue", "Idea1");
    PostIt second = new PostIt("pink", "black", "Awesome");
    PostIt third = new PostIt("yellow", "green", "Superb");

    System.out.println(first.backgroundColor +","+ first.text +","+ first.textColor);
    System.out.println(second.backgroundColor +","+ second.text +","+ second.textColor);
    System.out.println(third.backgroundColor +","+ third.text +","+ third.textColor);



  }
}
