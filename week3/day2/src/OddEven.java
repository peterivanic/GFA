import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("Number is odd.");
        }else{
            System.out.println("Number is even.");
        }
    }
}
