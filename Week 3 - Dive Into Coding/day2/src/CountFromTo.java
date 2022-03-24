import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write two numbers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first < second){
            for (int i = first; i < second; i++ ){
                System.out.println(i);
            }
        }else {
            System.out.println("The second number should be bigger");
        }
    }
}
