import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {
        Map<Integer,Character> myMap = new HashMap<>();
        System.out.println(myMap.isEmpty());
        myMap.put(97,'a');
        myMap.put(98,'b');
        myMap.put(99,'c');
        myMap.put(65,'A');
        myMap.put(66,'B');
        myMap.put(67,'C');
        String s = "[";
        String m = "[";
        for (Map.Entry<Integer,Character> obj : myMap.entrySet()) {

            s = s + obj.getKey() + ", ";
            m = m + obj.getValue() + ", ";
        }
        s = s + "]";
        m = m + "]";
        System.out.println(s);
        System.out.println(m);

        myMap.put(68,'D');
        System.out.println(myMap.size());
        System.out.println(myMap.get(99));

        myMap.remove(97);
        System.out.println(myMap.get(100));

        myMap.clear();
        System.out.println(myMap.size());
    }
}
