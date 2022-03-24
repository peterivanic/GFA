public class NumberAdder {
    // Write a recursive function that takes one parameter: n and returns
// the sum of numbers (integers) from 1 to n. The function should
// return 0 for inputs less than 1.
    public static Integer numberAdder(Integer number){
        if (number < 1){
            return 0;
        }else {
            return number + numberAdder(number - 1);
        }
    }

    public static void main(String[] args) {
        int result = numberAdder(5);
        System.out.println(result);
    }
}
