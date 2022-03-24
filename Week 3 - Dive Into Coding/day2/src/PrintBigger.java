import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write two numbers: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        System.out.println(Math.max(i, j));
    }
}
