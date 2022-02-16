import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {


    @Test
    public void fibonacciOk() {
        int a = 1;
        int e = 0;
        var f = new Fibonacci();
        int index = 9;
        int actual = f.fibonacci(index);

        for (int i = 0; i < index; i++) {
            a = a + e;
            e = a - e;
        }
        assertEquals(e, actual);
    }

    @Test
    public void fibonacci610() {
        int e = 610;
        var f = new Fibonacci();
        int index = 15;
        int actual = f.fibonacci(index);

        assertEquals(e, actual);
    }


}