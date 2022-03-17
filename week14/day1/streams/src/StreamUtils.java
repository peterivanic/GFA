import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtils {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
                "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');
        String s2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";


        System.out.println(evenNumbers(numbers1));
        System.out.println(squaresOfPositiveNumbers(numbers1));
        System.out.println(squaresIsGreater(numbers2, 20));
        System.out.println(averageOddNumbers(numbers1));
        System.out.println(sumOddNumbers(numbers3));
        System.out.println(upperCaseCharacter(s));
        System.out.println(startWith(cities, 'R'));
        System.out.println(concatenated(characters));
        System.out.println(specifyingTheFrequency(s2));
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

    public static int sumOddNumbers(List<Integer> listOfNumbers) {
        return listOfNumbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> Integer.parseInt(String.valueOf(x)))
                .sum();
    }

    public static List<Character> upperCaseCharacter(String words) {
        return words.chars()
                .mapToObj(x -> (char) x)
                .filter(Character::isUpperCase)
                .toList();
    }

    public static List<String> startWith(List<String> words, char character) {
        return words.stream()
                .filter(x -> x.toUpperCase().startsWith(String.valueOf(character)))
                .toList();
    }

    public static String concatenated(List<Character> characters) {
        return characters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static Map<Character, Long> specifyingTheFrequency(String text) {
        var st = Stream.of(text);
        return st
                .flatMap(x -> x.chars().boxed())
                .map(x -> (char) x.intValue())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x,y)->x,LinkedHashMap::new));
    }

}
