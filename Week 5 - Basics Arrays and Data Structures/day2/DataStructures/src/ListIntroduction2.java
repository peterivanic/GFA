import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListIntroduction2 {
    public static void main(String[] args) {
        String[] list ={"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};
        ArrayList<String> listA = new ArrayList<>(Arrays.asList(list));
        ArrayList<String> listB = new ArrayList<>(listA);

        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4,"Kiwifruit");
        System.out.println(listA.size()<listB.size());
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        String[] pp = {"Passion Fruit","Pomelo"};
        listB.addAll(List.of(pp));
        System.out.println(listA.get(2));
        System.out.println(listA);
        System.out.println(listB);

    }
}
