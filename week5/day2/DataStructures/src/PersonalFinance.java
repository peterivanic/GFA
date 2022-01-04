import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> list;
        list = List.of(500, 1000, 1250, 175, 800, 120);
        System.out.println(list);
        int sum = 0;
        for (int i : list){
            sum = sum + i;
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        float size = (float) list.size();

        float ave = sum/ size;

        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(ave);
    }
}
