package fox;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoxMain {

    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Bob", "GREEN", 3));
        foxes.add(new Fox("Joe", "WHITE", 6));
        foxes.add(new Fox("Rob", "GREEN", 7));
        foxes.add(new Fox("Jack", "BLACK", 3));
        foxes.add(new Fox("John", "GREEN", 5));
        foxes.add(new Fox("Mark", "GRAY", 2));
        foxes.add(new Fox("Tim", "RED", 9));
        foxes.add(new Fox("Tom", "GREEN", 1));

        System.out.println(greenFoxes(foxes));
        System.out.println(greenFoxesYoungerThat(foxes,5));
        System.out.println(colorFrequency(foxes));
    }

    public static List<Fox> greenFoxes(List<Fox> foxes) {
        return foxes.stream()
                .filter(x -> x.getColor().equals("GREEN"))
                .toList();
    }

    public static List<Fox> greenFoxesYoungerThat(List<Fox> foxes, Integer olderThan) {
        return foxes.stream()
                .filter(x -> x.getColor().equals("GREEN"))
                .filter(x -> x.getAge() < olderThan)
                .toList();
    }

    public static Map<String , Long> colorFrequency(List<Fox> foxes){
        return foxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor,Collectors.counting()));
    }
}
