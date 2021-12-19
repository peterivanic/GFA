import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Wiliam");
        if (names.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name : names) {
            System.out.println(name);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ". " + names.get(i));
        }
        names.remove(1);
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        names.removeAll(names);
        System.out.println(names.size());
    }
}
