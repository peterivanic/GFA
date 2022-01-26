public class Power {

    public static int power(int base, int n) {
        if ( n == 0) {
            return 1 ;
        }else {
            return  base * power(base,n-1);
        }
    }

    public static void main(String[] args) {
        int result = power(5,4);
        System.out.println(result);
    }
}
