import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the 5 numbers:");

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();
        int numb4 = scanner.nextInt();
        int numb5 = scanner.nextInt();

        int sum = numb1 + numb2 + numb3 + numb4 + numb5;
        int average = sum / 5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
