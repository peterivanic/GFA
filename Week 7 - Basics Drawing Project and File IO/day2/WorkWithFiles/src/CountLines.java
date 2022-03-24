import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
    // Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
    public static void main(String[] args) {
        System.out.println( countLines("src\\my-file.txt"));
    }

    public static int countLines(String fileName){
        Path filePath = Paths.get(fileName);
        int count = 0;
        try {
           count=(int) Files.lines(filePath).count();
            return count;
        } catch (IOException e) {
            System.err.println("Unable to read file: "+ fileName);
            return count;
        }
    }
}
