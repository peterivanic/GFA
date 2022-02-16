import Sum.Sum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void sumOk(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Sum sum = new Sum();
        var excepted = 6;
        var actual = sum.sum(numbers);

        assertEquals(excepted,actual);
    }

    @Test
    public void sumEmpty(){
        ArrayList<Integer> numbers = new ArrayList<>();

        Sum sum = new Sum();
        int excepted = 0;
        var actual = sum.sum(numbers);

        assertEquals(excepted,actual);
    }

}