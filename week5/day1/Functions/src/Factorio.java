public class Factorio {
    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
    public static int calculateFactorial(int number) {
        int sum = 1;
        for (int i = number; i > 0; i--) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
}
