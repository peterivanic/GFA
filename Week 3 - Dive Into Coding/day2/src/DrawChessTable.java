public class DrawChessTable {
    // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
    public static void drawChessTable() {
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= 8; j++) {
                    if (j % 2 != 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else
                for (int j = 1; j <= 8; j++) {
                    if (j % 2 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
                System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        drawChessTable();
    }
}