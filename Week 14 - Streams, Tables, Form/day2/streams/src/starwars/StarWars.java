package starwars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class StarWars {

    public static void main(String[] args)  {
        String file = "C:\\GreenFox\\greenfox\\peterivanic\\Week 14 - Streams, Tables, Form\\" +
                "day2\\streams\\src\\starwars\\SWuniverse.txt";

        System.out.println(heaviest(Objects.requireNonNull(getPersons(file))));
        System.out.println(averageHeightMale(Objects.requireNonNull(getPersons(file))));

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
                                Double.parseDouble(items[1]), Double.parseDouble(items[2]), items[3], items[4], items[5], items[6],items[7]);
                    }).toList();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static String  heaviest(List<Person> persons) {
        String heaviest = persons.stream()
                .map(Person::getMas)
                .max(Double::compareTo)
                .toString()
                .replace("Optional","")
                .replace("[","")
                .replace("]","");
       return persons
               .stream()
               .filter(x-> String.valueOf(x.getMas()).equals(heaviest))
               .map(Person::getName)
               .toList()
               .toString();
    }

    public static OptionalDouble averageHeightMale(List<Person> persons){
       return persons.stream()
                .filter(x-> x.getGender().equals("male")||x.getGender().equals("hermaphrodite"))
                .mapToDouble(Person::getHeight)
                .average();
    }

}
