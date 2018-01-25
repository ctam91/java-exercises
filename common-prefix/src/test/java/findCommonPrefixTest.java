import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findCommonPrefixTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        String[] input = new String[] {"aca", "cba"};
        String expected = "";

        assertEquals(expected, solution.longestCommonPrefix(input));
    }

    @Test
    public void testTwo(){
        String[] input = new String[] {"", ""};
        String expected = "";

        assertEquals(expected, solution.longestCommonPrefix(input));
    }


    @Test
    public void testThree(){
        String[] input = new String[] {"ab", "abc", "aabba"};
        String expected = "a";

        assertEquals(expected, solution.longestCommonPrefix(input));
    }
}
