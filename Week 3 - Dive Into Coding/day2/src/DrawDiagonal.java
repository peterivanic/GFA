import java.util.Scanner;

public class DrawDiagonal {
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

    public static void drawDiagonal(int lineCount) {
        String s = "%";

        for (int i = 1; i <= lineCount; i++) {

            if (i == 1 || i == lineCount) {
                System.out.println(s.repeat(lineCount));
            } else {
                for (int j = 1; j <= lineCount; j++) {
                    if (j == 1 || j == lineCount || j==i) {
                        System.out.print(s);
                    }
                    else {
                        System.out.print(" ");
                    }

                }System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Please write count of lines:");

        Scanner scanner = new Scanner(System.in);

        int lineCount = scanner.nextInt() ;
        drawDiagonal(lineCount);
    }
}
