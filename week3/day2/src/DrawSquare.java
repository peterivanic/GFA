public class DrawSquare {
    // Write a program that draws a square like this:
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as lineCount i
    public static void drawSquare(int lineCount) {
        String s = "%";

        for (int i = 1; i <= lineCount; i++) {

            if (i == 1 || i == lineCount) {
                System.out.println(s.repeat(lineCount));
            } else {
                for (int j = 1; j <= lineCount; j++) {
                    if (j == 1 || j == lineCount) {
                        System.out.print(s);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        int lineCount = 8;
        drawSquare(lineCount);
    }
}

