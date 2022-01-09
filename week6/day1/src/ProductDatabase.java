import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        Map<String,Integer> products = new HashMap<>();
        products.put("Eggs",200);
        products.put("Milk",200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken",550);

        System.out.println(products.get("Fish"));
        double avg = 0;
        double sum = 0;


        for (Map.Entry<String,Integer> entry : products.entrySet()){

        }
    }
}
