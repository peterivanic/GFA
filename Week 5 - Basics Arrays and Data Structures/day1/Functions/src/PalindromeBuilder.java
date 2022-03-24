public class PalindromeBuilder {
    //Create a function named createPalindrome() following your current language's
    //style guide. It should take a string, create a palindrome from it and then return it.

    public static String createPalindrome(String word) {
        StringBuilder wordFromBack = new StringBuilder();
        char[] wordArray = word.toCharArray();
        String palindrome;

        for (int i = wordArray.length - 1; i >= 0; i--) {
            wordFromBack.append(wordArray[i]);
        }
        palindrome = word + wordFromBack;
        return  palindrome;
    }

    public static void main(String[] args) {
        System.out.println(createPalindrome("greenfox"));
        System.out.println(createPalindrome("123"));
    }
}
