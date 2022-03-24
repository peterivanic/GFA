import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the 5 numbers:");

       for (int i = 0; i < 5; i++){
           int number = scanner.nextInt();
           sum += number;
       }



        double average = (double) sum / 5;

        System.out.println("Sum: " + sum + ", Average: " +  average);
    }
}
