public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 15;
        multiplicationTable(number);
    }
        public static void multiplicationTable(int number) {
            // write your code here for Gradescope testing
                for (int i = 1; i <= 10; i++ ){
                    int result;
                    result = number * i;
                    System.out.println(i + " * " + number + " = " + result);
                }
        }
}
