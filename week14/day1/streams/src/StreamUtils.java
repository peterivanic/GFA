import java.util.Arrays;
import java.util.List;

public class StreamUtils {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(evenNumbers(numbers));
        System.out.println(squaresOfPositiveNumbers(numbers));
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
}
