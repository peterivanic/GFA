import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map<Character, Integer> countLetters(@NotNull String text) {
        Map<Character, Integer> charMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!charMap.containsKey(ch)) {
                charMap.put(ch, count);
            } else {
                charMap.replace(ch, charMap.get(ch) + 1);
            }
        }
        return charMap;
    }

}
