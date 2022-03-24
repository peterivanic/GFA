import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedOrder {
    // Create a method that decrypts reversed-order.txt
    public static void main(String[] args) {

        reversedOrder("src\\reversed-order.txt");
    }

    public static void reversedOrder(String fileName) {

        try {
            Path filePath = Paths.get(fileName);
            List<String> file = Files.readAllLines(filePath);

            String[] file2 = new String[file.size()];
            int i = 1;

            for (String s : file) {
                file2[file.size() - i] = s;
                i++;

            }
            List<String> file3 = new ArrayList<>(Arrays.stream(file2).toList());
            StringBuilder sb = new StringBuilder();
            for (String s : file3) {
                sb.append(s);
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
