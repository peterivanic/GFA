import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {
    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)

    public static void findUniqueItems(int[] arrayOfNumbers){
        List<Integer> newList = new ArrayList<>();
        for ( int i : arrayOfNumbers){
            if (newList.contains(i)){

            }else {
                newList.add(i);
            }
        }
        System.out.println(newList);

    }

    public static void main(String[] args) {

        int [] intArray = {1, 11, 34, 11, 52, 61, 1, 34};
        findUniqueItems(intArray);
    }
}
