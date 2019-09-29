package animal;

public class Main {
  public static void main(String[] args) {

    Animal dog = new Animal();
    System.out.println(dog.hunger);

    dog.play();
    for (int i = 0; i < 10; i++) {
      dog.drink();
      dog.eat();
    }

    System.out.println("thirst: " + dog.thirst);
    System.out.println("hunger: " + dog.hunger);

    Animal cat = new Animal(100);
    System.out.println("cat's hunger: " + cat.getHunger());




  }
}

//  Create an Animal class
//        Every animal has a hunger value, which is a whole number
//        Every animal has a thirst value, which is a whole number
//        when creating a new animal object these values are created with the default 50 value
//    Every animal can eat() which decreases their hunger by one
//    Every animal can drink() which decreases their thirst by one
//    Every animal can play() which increases both by one
