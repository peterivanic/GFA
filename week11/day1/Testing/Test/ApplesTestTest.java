import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTestTest {

    @Test
    public void getAppleOk(){
        var apple = new Apple();
        var excepted = "apple";
        var actual = apple.getApple();

        assertEquals(excepted,actual);
    }
}