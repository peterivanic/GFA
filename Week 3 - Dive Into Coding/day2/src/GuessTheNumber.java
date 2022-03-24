import java.util.Scanner;

// Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

public class GuessTheNumber {

    public static void guessTheNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number:");
        int number = sc.nextInt();
        System.out.println("Please insert the guess number:");
        int guessNumber = sc.nextInt();

        while (guessNumber != number) {

            if (guessNumber < number) {
                System.out.println("The stored number is higher");
            }
            if (guessNumber > number) {
                System.out.println("The stored number is lower");
            }
            System.out.println("Please insert the next guess number:");
            guessNumber = sc.nextInt();
        }
        System.out.println("You found the number: " + guessNumber);
    }


    public static void main(String[] args) {
        guessTheNumber();
    }
}
