import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class reverseStringTest {

    private ReverseString manager;

    @Before
    public void setUp(){
        manager = new ReverseString();
    }

    @Test
    public void testOne(){
        String input = "apple";
        String expected = "elppa";

        assertEquals(expected, manager.reverseString(input));
    }

    @Test
    public void testTwo(){
        String input = "Hello, World";
        String expected = "dlroW ,olleH";

        assertEquals(expected, manager.reverseString(input));
    }
}
