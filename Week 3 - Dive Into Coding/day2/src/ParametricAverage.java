import java.util.Scanner;

public class ParametricAverage {

    // Write a program that asks for a number
// It would ask this many times to enter an integer
// If all the integers are entered it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

    public static void parametricAverage() {

        System.out.println("Please insert the number:");
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int sum, numb2, count;
        double average;
        sum = numb1;
        count = 0;

        do {
            System.out.println("Please insert the number, if you want average and sum of numbers press 0.");
            numb2 = scanner.nextInt();
            sum = sum + numb2;
            count++;
        } while (numb2 != 0);

        average = (double) sum / count;
        System.out.println("Sum: " + sum + " Average: " + average);
    }

    public static void main(String[] args) {
        parametricAverage();
    }
}
