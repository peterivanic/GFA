import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
    public static void reverse (Integer[] array){
        Collections.reverse(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Integer[] numbers  = {3, 4, 5, 6, 7};
        reverse(numbers);
        for ( int i : numbers){
            System.out.println(i);
        }
    }
}
