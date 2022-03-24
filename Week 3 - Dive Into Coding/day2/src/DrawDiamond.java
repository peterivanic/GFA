import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
    private static void drawDiamond(int line) {
        for (int i = 1; i <= line / 2 + 1; i++) {
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = (line / 2); i > 0; i--) {
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the count of line:");
        int line = scanner.nextInt();
        drawDiamond(line);
    }

}
