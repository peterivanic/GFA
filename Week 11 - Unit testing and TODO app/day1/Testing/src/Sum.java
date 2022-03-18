import java.util.ArrayList;

public class Sum {

    public Integer sum(ArrayList<Integer> numbers){
        if (numbers==null){
           return null;

        }
        var sum = 0;
        for (var n : numbers){
            sum += n;
        }
        return sum;
    }
}
