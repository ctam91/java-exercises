import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class removeDuplicatesTest {
    private RemoveDuplicates manager;

    @Before
    public void setUp(){
        manager = new RemoveDuplicates();
    }

    @Test
    public void testOne(){
        int[] input = new int[] {1,1,2};
        int expected = 2;

        assertEquals(expected, manager.removeDuplicates(input));
    }

    @Test
    public void testTwo(){
        int[] input = new int[] {};
        int expected = 0;

        assertEquals(expected, manager.removeDuplicates(input));
    }

    @Test
    public void testThree(){
        int[] input = new int[] {1};
        int expected = 1;

        assertEquals(expected, manager.removeDuplicates(input));
    }
}
