import java.util.Arrays;

public class Anagram {
 //   Create a function named isAnagram() following your current
 //   language's style guide. It should take two strings
 //   and return a boolean value depending on whether it's an anagram or not.

    public static boolean isAnagram(String word1, String word2){
        if (word1.length()!= word2.length()){
            return false;
        }
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("dog","god"));
        System.out.println(isAnagram("green","fox"));
    }
}
