import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public interface MapIntroduction2 {

    public static void main(String[] args) {
//        Create a map where the keys are strings and the values are strings with the following initial values
        Map<String, String> myMap = new HashMap<>();
        myMap.put("978-1-60309-452-8", "A Letter to Jo");
        myMap.put("978-1-60309-459-7", "Lupus");
        myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap.put("978-1-60309-461-0", "The Lab");

//        Print all the key-value pairs in the following format
        for (Map.Entry<String,String> obj : myMap.entrySet()){
            String key = obj.getKey();
            String value = obj.getValue();
            System.out.println(value+"(ISBN: "+key+")");
        }
//        Remove the key-value pair with key 978-1-60309-444-3
        myMap.remove("978-1-60309-444-3");

//        Remove the key-value pair with value The Lab
        String s = null;
        for (Map.Entry<String,String> obj : myMap.entrySet()){
            String value = obj.getValue();
            if (Objects.equals(value, "The Lab")){
                s = obj.getKey();
            }
        }
        myMap.remove(s);

//        Add the following key-value pairs to the map
        myMap.put("978-1-60309-450-4","They Called Us Enemy");
        myMap.put("978-1-60309-453-5","Why Did We Trust Him?");

//        Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(myMap.containsKey("478-0-61159-424-8"));

//        Print the value associated with key 978-1-60309-453-5
        System.out.println(myMap.get("978-1-60309-453-5"));
    }
}
