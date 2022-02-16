import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void anagramOk(){
        var anagram = new Anagram();
        var excepted = true;
        var actual = anagram.anagram("SilenT","liSTEn");

        assertEquals(excepted,actual);

    }

    @Test
    public void anagramNot(){
        var anagram = new Anagram();
        var excepted = false;
        var actual = anagram.anagram("SilenT","liST");

        assertEquals(excepted,actual);

    }

}