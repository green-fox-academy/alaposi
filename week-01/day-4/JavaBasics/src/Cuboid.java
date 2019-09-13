public class Cuboid {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 8;
        double surface = 2* (a * b + a * c + b * c);
        double volume = a * b * c;

        System.out.println("Surface area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
