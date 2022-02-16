import java.util.Locale;

public class Anagram {

    public boolean anagram(String word1, String word2) {

        word1 = word1.toLowerCase(Locale.ROOT);
        word2 = word2.toLowerCase(Locale.ROOT);
        int k = 0;
        for (int i = 0; i < word1.length(); i++){
            for (var ch : word2.toCharArray()){
                if (word1.charAt(i) == ch){
                    k++;
                }
            }
        }
        return k == word1.length();
    }

}
