import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
//        Create a map with the following key-value pairs:
        Map<String, Integer> productDatabase2 = new HashMap<>();
        productDatabase2.put("Eggs", 200);
        productDatabase2.put("Milk", 200);
        productDatabase2.put("Fish", 400);
        productDatabase2.put("Apples", 150);
        productDatabase2.put("Bread", 50);
        productDatabase2.put("Chicken", 550);

//        Create an application which prints out the answers to the following questions:
//
//        Which products cost less than 201? (just the name)
//        Which products cost more than 150? (name + price)
        for (Map.Entry<String, Integer> obj : productDatabase2.entrySet()) {

            if (obj.getValue() < 201) {
                System.out.println(obj.getKey());
            }
        }
        for (Map.Entry<String, Integer> obj : productDatabase2.entrySet()) {

            if (obj.getValue() > 150) {
                System.out.println(obj.getKey() +" "+ obj.getValue());
            }
        }
    }
}
