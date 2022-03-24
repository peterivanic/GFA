import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        System.out.println("Please write the divisor");
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        divides(divisor);
    }

    public static void divides(int divisor){
        try {
            int result = 10/divisor;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.err.println("Can't divide by zero!");
        }
    }
}
