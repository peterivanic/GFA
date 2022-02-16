package Sum;

import java.util.ArrayList;

public class Sum {

    public int sum(ArrayList<Integer> numbers){
        var sum = 0;
        for (var n : numbers){
            sum += n;
        }
        return sum;
    }
}
