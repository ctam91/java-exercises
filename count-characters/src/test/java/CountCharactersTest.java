import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCharactersTest {
    private CountCharacters manager;

    @Before
    public void setUp(){
        manager = new CountCharacters();
    }

    @Test
    public void testOne(){
        String input = "aabbcca";
        String expected = "2a2b2c1a";

        assertEquals(expected, manager.countChar(input));
    }

    @Test
    public void testTwo(){
        String input = "aabbccca";
        String expected = "2a2b3c1a";

        assertEquals(expected, manager.countChar(input));
    }

    @Test
    public void testThree(){
        String input = "Aabbc";
        String expected = "1A1a2b1c";

        assertEquals(expected, manager.countChar(input));
    }
}
