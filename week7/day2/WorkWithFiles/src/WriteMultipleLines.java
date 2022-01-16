import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteMultipleLines {
    // Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// - The path parameter should be a string that describes the location (path & name)
//    of the file you wish to modify.
// - The word parameter should also be a string that will be written to the file as individual lines.
// - The number parameter should describe how many lines the file should have.

    // If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'.
// The function should not raise any errors if it could not write the file.
    public static void main(String[] args) {

        String file = "my-file3.txt";
        String word = "apple";
        writeMultipleLines(file,word,7);
    }

    public static void writeMultipleLines(String file,String word,int count){
        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < count ; i++) {
                fw.write(word+"\n");
            }
            fw.close();
        } catch (IOException e) {
            System.err.println("Unable to write file: "+ file);
        }
    }
}
