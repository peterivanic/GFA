import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {


    Path path = Paths.get("C:\\GreenFox\\greenfox\\peterivanic\\week11\\day2\\Todo\\src\\tasks.txt");
    FileWriter txt = new FileWriter(String.valueOf(path), true);


    public Tasks() throws IOException {
    }


    public void addTask(String task) throws IOException {
        List<String> lines = Files.readAllLines(path);

        txt.write(lines.size()+1 + " - [ ] " + task + "\n");
        txt.close();

    }

    public String listOfTask() throws IOException {
        List<String> lines = Files.readAllLines(path);
        if (lines.size()==0){
            return "No todos for today! :)";
        }else {
           StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        }
    }

    public void removeTask(int indexOfDeleting) throws IOException {

        List<String> lines = Files.readAllLines(path);
        if (indexOfDeleting>lines.size()){
            System.err.println("Unable to remove: index is out of bound");
        }else {
            lines.remove(indexOfDeleting-1);
        }
        Files.write(path,lines);
    }

    public void checkTask(int indexOfCheck) throws IOException {

        List<String> lines = Files.readAllLines(path);
        if (indexOfCheck>lines.size()){
            System.err.println("Unable to check: index is out of bound");
        }else {
        String newS = lines.get(indexOfCheck-1).replace("[ ]","[x]");
        lines.remove(indexOfCheck-1);
        lines.add(indexOfCheck-1,newS);
        }
        Files.write(path,lines);
    }

}
