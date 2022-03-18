package starwars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StarWars {

    public static void main(String[] args)  {
        String file = "C:\\GreenFox\\greenfox\\peterivanic\\Week 14 - Streams, Tables, Form\\" +
                "day2\\streams\\src\\starwars\\SWuniverse.txt";



    }

    public static List<Person> getPersons(String file)  {
        try {
            List<String> fileLines = Files.readAllLines(Path.of(file));
            return fileLines.stream()
                    .map(x -> x.replace(",", ";"))
                    .map(x -> x.replace("unknown", "0"))

                    .map(x -> {
                        String[] items = x.split(";");
                        return new Person(items[0],
                                Long.parseLong(items[1]), Double.parseDouble(items[2]), items[3], items[4], items[5], items[6]);
                    }).toList();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }



}
