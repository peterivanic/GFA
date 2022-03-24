import java.util.Scanner;

public class DrawPyramid {
    // Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    public static void drawTriangle(int lineCount) {
        for (int i = 1; i <= lineCount; i++) {
            String s = "*";
            String m = " ";
            for (int j = i; j < lineCount; j++) {
                System.out.print(m);
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the count of line:");
        int line = scanner.nextInt();
        drawTriangle(line);
    }

}
