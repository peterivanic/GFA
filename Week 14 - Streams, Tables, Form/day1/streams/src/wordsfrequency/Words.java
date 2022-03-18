package wordsfrequency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {

    public static void main(String[] args) {

        String file = "C:\\GreenFox\\greenfox\\peterivanic\\Week 14 - Streams, Tables, Form\\day1\\streams\\src\\" +
                "wordsfrequency\\javawiki.txt";
        System.out.println(getWordFrequency(file));
        System.out.println(mostCommonWords(file));
    }

    public static Map<String,Long> getWordFrequency(String file){
        try {
          String words = Files.readString(Path.of(file));
         return Arrays.stream(words
                  .replaceAll("[^a-zA-Z]+", " ")
                  .split(" "))
                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static Map<String,Long> mostCommonWords(String file){
       return Objects.requireNonNull(getWordFrequency(file))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));


    }

}
