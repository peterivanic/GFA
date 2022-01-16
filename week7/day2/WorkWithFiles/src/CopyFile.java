import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    // Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {

        System.out.println(copyFile("src\\my-file2.txt","src\\my-file4.txt"));
    }

    public static boolean copyFile(String sourceFile, String targetFile){
        Path sourcePath = Paths.get(sourceFile);
        Path targetPath = Paths.get(targetFile);
        try {
            Files.copy(sourcePath,targetPath);
            return true;
        } catch (IOException e) {
            System.err.println("Unable to copy file !");
            return false;
        }
    }
}
