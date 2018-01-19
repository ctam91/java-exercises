import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class singleNumberTest {

    private SingleNumber manager;

    @Before
    public void setUp(){
        manager = new SingleNumber();
    }

    @Test
    public void testOne(){
        int[] input = new int[] {1,1,2,2,3,4,4,5,5};
        int expected = 3;

        assertEquals(expected, manager.findSingleNumber(input));
    }
}
