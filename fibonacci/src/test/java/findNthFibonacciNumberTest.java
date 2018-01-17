import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findNthFibonacciNumberTest {

    private Fibonacci manager;

    @Before
    public void setUp(){
        manager = new Fibonacci();
    }

    @Test
    public void testOne(){
        int input = 5;
        int expected = 3;

        assertEquals(expected, manager.findNthFibonacciNumber(input));
    }

    @Test
    public void testTwo(){
        int input = 7;
        int expected = 8;

        assertEquals(expected, manager.findNthFibonacciNumber(input));
    }
}
