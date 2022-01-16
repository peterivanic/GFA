import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Doubled {
    // Create a method called decryptDoubled() that takes a filename as string as a parameter
    // and it can decrypt the duplicated-chars.txt file
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    // If the file can't be opened it should return this message: File not found
    // The result should be saved in the output.txt file
    public static void main(String[] args) {

        decryptDoubled("src\\duplicated.txt");
    }

    public static void decryptDoubled(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            List<String> file = Files.readAllLines(filePath);
            String decryptedFile = "";
            for (String s : file) {
                for (int i = 0; i < s.length(); i++) {
                    if (i % 2 != 0) {
                        decryptedFile = decryptedFile.concat(String.valueOf(s.charAt(i)));
                    }
                }
                decryptedFile = decryptedFile.concat(System.lineSeparator());
            }
            Files.writeString(Path.of("src\\output.txt"), decryptedFile);

        } catch (Exception e) {
            System.err.println("File not found");
        }
    }
}
