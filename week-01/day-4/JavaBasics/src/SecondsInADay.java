public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 32;
        int currentSeconds = 42;

        int totalSecondsOfTheDay = 60 * 60 * 24;
        int secondsPassed = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;
        int secondsLeft = totalSecondsOfTheDay - secondsPassed;

        //System.out.println(totalSecondsOfTheDay);
        //System.out.println(secondsPassed);
        System.out.println(secondsLeft);


    }
}
