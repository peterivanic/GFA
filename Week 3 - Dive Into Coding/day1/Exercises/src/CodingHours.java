public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyHours = 6;
        int weeks = 17;
        int weekWorkingHours = 52;
        int weekCodingHours = 30;
        int allHours = dailyHours * weeks * 5;
        float tenPercent = (float) weekWorkingHours / 10;
        float result = weekCodingHours / tenPercent;

        System.out.println(allHours + " hours spent with coding in a semester.");
        System.out.println("Percentage of the coding hours in week is " + result * 10 + " %.");

    }
}
