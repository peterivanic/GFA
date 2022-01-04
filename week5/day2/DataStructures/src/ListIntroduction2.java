import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        String[] list ={"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};
        List<String> listA;
        List<String> listB = new ArrayList<>();
        listA = List.of(list);
        listB = listA;
        System.out.println(listA.contains("Durian"));


        listA.add(4,"Kiwifruit");


    }
}
