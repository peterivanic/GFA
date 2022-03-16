import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamUtils {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);


        System.out.println(evenNumbers(numbers1));
        System.out.println(squaresOfPositiveNumbers(numbers1));
        System.out.println(squaresIsGreater(numbers2,20));
        System.out.println(averageOddNumbers(numbers1));
        System.out.println(sumOddNumbers(numbers3));
    }

    public static List<Integer> evenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
    }

    public static List<Integer> squaresOfPositiveNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x > 0)
                .map(x -> x * x)
                .toList();
    }

    public static List<Integer> squaresIsGreater(List<Integer> listOfNumbers, int greaterThan) {
        return listOfNumbers.stream()
                .filter(x -> x * x > greaterThan)
                .toList();
    }

    public static OptionalDouble averageOddNumbers(List<Integer> listOfNumbers) {
        return listOfNumbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToDouble(x -> Double.parseDouble(String.valueOf(x)))
                .average();
    }

    public static int sumOddNumbers(List<Integer> listOfNumbers){
       return listOfNumbers.stream()
                .filter(x -> x%2!= 0)
                .mapToInt(x-> Integer.parseInt(String.valueOf(x)))
                .sum();
    }
}
