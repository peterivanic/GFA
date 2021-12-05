import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the count of line:");
        int line = scanner.nextInt();
        drawTriangle(line);
    }

    public static void drawTriangle(int lineCount){
        for (int i = 0; i < lineCount; i++){
            String s = "* ";
            String m = " ";
            for (int j = 0; j < lineCount - i; j++){
                System.out.print(m);
            }
            for (int k = 0; k <= i; k++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
