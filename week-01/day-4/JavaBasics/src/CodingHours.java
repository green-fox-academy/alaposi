public class CodingHours {
    public static void main(String[] args) {
        int dailyCodingHours = 6;
        int semesterWeeks = 17;
        int workdays = 5;
        int totalHours = dailyCodingHours * semesterWeeks * workdays;


        System.out.println(totalHours + " hours are spent with coding in a semester by an attendee.");
        System.out.println("The percentage of the working hours in the semester is " + Math.round((float) dailyCodingHours * workdays / 52 * 100) + ".");
    }
}
