import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class firstUniqCharTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        String input = "dddccdbba";
        int expected = 8;

        assertEquals(expected, solution.firstUniqChar(input));
    }
}
