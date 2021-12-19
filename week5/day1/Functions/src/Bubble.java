import java.util.Arrays;

public class Bubble {
    //  Create a function that takes an array of numbers as parameter
    //  and returns an array where the elements are sorted in ascending numerical order
    //  When you are done, add a second boolean parameter to the function
    //  If it is `true` sort the array descending, otherwise ascending

    public static String bubble(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        return Arrays.toString(arrayOfNumbers);
    }

    public static String advanceBuble(int[] arrayOfNumbers, boolean descending) {
        if (descending) {
            for (int i = 0; i < arrayOfNumbers.length / 2; i++) {
                int j = arrayOfNumbers[i];
                arrayOfNumbers[i] = arrayOfNumbers[arrayOfNumbers.length - i - 1];
                arrayOfNumbers[arrayOfNumbers.length - i - 1] = j;
            }
        } else {
            Arrays.sort(arrayOfNumbers);
        }
        return Arrays.toString(arrayOfNumbers);
    }

    public static void main(String[] args) {
        int[] numbers = {34, 12, 24, 9, 5};
        System.out.println(bubble(numbers));
        System.out.println(advanceBuble(numbers, true));
    }
}
