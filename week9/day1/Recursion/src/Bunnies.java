public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears. Write
// a recursive method (no loops or multiplication) which takes the number of
// bunnies as its sole parameter and returns the total number of ears
// the bunnies have. The method should be able to handle invalid input
// (e.g. negative numbers)
    public static int bunnies(int bunniesCount) {
        if (bunniesCount < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        } else {
            if (bunniesCount<1){
                return bunniesCount;
            }else{
                return 2+bunnies(bunniesCount - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(bunnies(8));
    }
}
