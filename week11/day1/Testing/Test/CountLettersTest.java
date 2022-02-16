import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {


    @Test
    public void countLettersOk(){
        var countlLetters = new CountLetters();

        Map<Character,Integer> excepted = new HashMap<>();
        excepted.put('h',1);
        excepted.put('e',1);
        excepted.put('l',2);
        excepted.put('o',1);
        var actual = countlLetters.countLetters("hello");

        assertEquals(excepted,actual);
    }

}