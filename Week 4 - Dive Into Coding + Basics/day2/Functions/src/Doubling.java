public class Doubling {
    // - Create an integer variable named `baseNumber` and assign the value `123` to it
// - Create a function called `doubleNumber()` that doubles its integer input parameter
//   and returns the doubled value
// - Print the result of `doubleNumber(baseNumber)`
    public static int doubleNumber(int number){
        number = number * 2;
        return number;
    }

    public static void main(String[] args) {
        int baseNumber = 123;
        System.out.println(doubleNumber(baseNumber));
    }
}
