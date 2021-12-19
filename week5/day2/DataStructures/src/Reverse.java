public class Reverse {
    // Create a method that can reverse a string which is passed as parameter
    // Pass the `toBeReversed` variable to this method to check if it works well
    // At first, solve this task using the `charAt()` function
    // Try other solutions when you are done

    public static void reverse(String stringToReverse) {
        String reversString = "";
        char ch;
        for (int i = 0; i < stringToReverse.length(); i++) {
            ch = stringToReverse.charAt(i);
            reversString = ch + reversString;
        }
        System.out.println(reversString);
    }

    public static void reverse1(String stringToReverse) {
        StringBuilder sb = new StringBuilder(stringToReverse);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverse(toBeReversed);
        reverse1(toBeReversed);
    }
}
