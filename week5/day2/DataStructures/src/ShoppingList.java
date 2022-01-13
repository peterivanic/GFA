import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {

    //    Create a list with the following items:
    static String[] list = {"eggs", "milk", "fish", "apples", "bread", "chicken"};
    static List<String> shoppingList = new ArrayList<>(Arrays.stream(list).toList());

//    Create an application which prints out the answers to the following questions:
//    Do we have milk in the shopping list? (yes/no)
//    Do we have bananas in the shopping list? (yes/no)
    public static String findInShoppingList(String name) {
        if (shoppingList.contains(name)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        System.out.println(findInShoppingList("milk"));
        System.out.println(findInShoppingList("bananas"));
    }
}

