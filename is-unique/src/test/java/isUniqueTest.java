import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class isUniqueTest {
    private IsUnique manager;

    @Before
    public void setUp(){
        manager = new IsUnique();
    }

    @Test
    public void testOne(){
        String input = "Helo Ask";
        boolean expected = true;

        assertEquals(expected, manager.isUnique(input));
    }

    @Test
    public void testTwo(){
        String input = "Hello, World";
        boolean expected = false;

        assertEquals(expected, manager.isUnique(input));
    }
}
