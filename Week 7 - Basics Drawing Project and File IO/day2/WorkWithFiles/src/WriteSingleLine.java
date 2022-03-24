import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteSingleLine {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".
    public static void main(String[] args) {
        String myName = "Peter Ivanic";
        String myFile = "src\\my-file2.txt";
        writeToFile(myFile,myName);

    }

    public static void writeToFile(String file,String newLine){
        Path filePath = Paths.get(file);
        try {
            Files.writeString(filePath,newLine);
        } catch (IOException e) {
            System.err.println("Unable to write file: "+ file);
        }
    }

}
