import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedLines {
    // Create a method that decrypts reversed-lines.txt
    public static void main(String[] args) {

        reversedLines("src\\reversed-lines.txt");
    }

    public static void reversedLines(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            List<String> file = Files.readAllLines(filePath);

            String [] file2= new String[file.size()];
            int i = 1;

            for (String s : file) {
                file2[file.size()-i] = s;
                i++;
            }

            List<String > file3 = new ArrayList<>(Arrays.stream(file2).toList());
            StringBuilder reversedFile = new StringBuilder();

            for (String s : file3) {
                reversedFile.append(s);
                reversedFile.append(System.lineSeparator());
            }

            reversedFile.reverse();
            Files.writeString(Path.of("src\\output1.txt"), reversedFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
