import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShoppingList2 {
    public static void main(String[] args) {
        Map<String,Double> products = new HashMap<>();
        products.put("milk",1.07);
        products.put("rice",1.59);
        products.put("eggs",3.14);
        products.put("cheese",12.60);
        products.put("chicken breasts",9.40);
        products.put("apples",2.31);
        products.put("tomato",2.58);
        products.put("potato",1.75);
        products.put("onion",1.10);

        Map<String,Double> bobList = new HashMap<>();
        bobList.put("milk",3.0);
        bobList.put("rice",2.0);
        bobList.put("eggs",2.0);
        bobList.put("cheese",1.0);
        bobList.put("chicken breasts",4.0);
        bobList.put("apples",1.0);
        bobList.put("tomato",2.0);
        bobList.put("potato",1.0);

        Map<String,Double> aliceList = new HashMap<>();
        aliceList.put("rice",1.0);
        aliceList.put("eggs",5.0);
        aliceList.put("chicken breasts",2.0);
        aliceList.put("apples",1.0);
        aliceList.put("tomato",10.0);

        double bobSum = 0;
        double aliceSum = 0;
        double bobPieces = 0;
        double alicePieces = 0;

        for (Map.Entry<String,Double> entry : bobList.entrySet()){
            bobSum += entry.getValue() * products.get(entry.getKey());
        }

        for (Map.Entry<String,Double> entry : aliceList.entrySet()){
            aliceSum += entry.getValue() * products.get(entry.getKey());
        }


        System.out.println(bobSum);
        System.out.println(aliceSum);
        if (bobList.get("rice")>aliceList.get("rice")){
            System.out.println("Bob");
        }
        if (aliceList.containsKey("potato")){
            if (bobList.get("potato")>aliceList.get("potato")){
                System.out.println("Bob");
            }
        }else
            System.out.println("Bob");



        if (bobList.containsKey("ham")&&aliceList.containsKey("ham")){

        }else{
            System.out.println("no one");
        }

        if (Objects.equals(bobList.get("apples"), aliceList.get("apples"))){
            System.out.println("no one");
        }

        if (bobList.size()>aliceList.size()){
            System.out.println("Bob");
        }

        for (Map.Entry<String,Double> entry : bobList.entrySet()){
            bobPieces += entry.getValue() ;
        }
        for (Map.Entry<String,Double> entry : aliceList.entrySet()){
            alicePieces += entry.getValue() ;
        }

        if (alicePieces>bobPieces){
            System.out.println("Alice");
        }

    }
}
