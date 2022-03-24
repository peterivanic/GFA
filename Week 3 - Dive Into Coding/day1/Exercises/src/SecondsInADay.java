public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int secondsInADay = 24 * 60 * 60;
        int currentHoursInSecond = currentHours * 60 * 60 ;
        int currentMinutesInSecond = currentMinutes * 60;
        int currentTimeInSecond = currentSeconds + currentHoursInSecond + currentMinutesInSecond ;
        int remainingSeconds = secondsInADay - currentTimeInSecond ;

        System.out.println(remainingSeconds);

    }

}
