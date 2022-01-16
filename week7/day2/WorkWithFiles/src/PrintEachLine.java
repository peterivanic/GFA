import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".
    public static void main(String[] args) {

        System.out.println(readFile("src\\my-file.txt"));
    }

    public static List<String> readFile(String file){
        Path filepath = Paths.get(file);
        try {
            return Files.readAllLines(filepath);
        }catch (IOException e){
            System.err.println("Unable to read file: "+ file);
            return new ArrayList<>();
        }
    }
}
