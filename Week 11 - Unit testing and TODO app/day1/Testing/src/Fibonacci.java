public class Fibonacci {

    public int fibonacci(Integer indexOfFibonacci){
        int actual = 1;
        int last = 0;
        for (int i = 0; i < indexOfFibonacci; i++) {
            actual = actual + last;
            last = actual - last;
        }
        return last;
    }

}
