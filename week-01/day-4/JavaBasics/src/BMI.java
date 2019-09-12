public class BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heighInM = 1.78;
        double BMI = massInKg/(Math.pow(heighInM,2));

        System.out.println(Math.round(BMI));
    }
}
