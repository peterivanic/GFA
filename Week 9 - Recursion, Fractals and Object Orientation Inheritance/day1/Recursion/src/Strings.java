public class Strings {
    // Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars changed to 'y' chars.

    public static String xToY(String word) {
        if (word.length()<1){
            return word;
        }else {
            char firstCH = word.charAt(0) == 'x'?'y': word.charAt(0);
            return firstCH + xToY(word.substring(1));
        }

    }

    public static void main(String[] args) {
        System.out.println(xToY("xena xerxes"));
    }
}
