package wordsfrequency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {

    public static void main(String[] args) {

        String file = "C:\\GreenFox\\greenfox\\peterivanic\\week14\\day1\\streams\\src\\wordsfrequency\\javawiki.txt";
        System.out.println(getWordFrequency(file));
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

}
