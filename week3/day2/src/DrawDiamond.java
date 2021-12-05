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
        for (int i=1; i<=line; i++ ){
            for (int j=line; j>i; j-- ){
                System.out.print(" ");
            }
            for (int k=i; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the count of line:");
        int line = scanner.nextInt();
        drawDiamond(line);
    }

}
