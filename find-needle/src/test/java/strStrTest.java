import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class strStrTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        String haystack = "hello";
        String needle = "ll";
        int expected = 2;

        assertEquals(expected, solution.strStr(haystack,needle));
    }

    @Test
    public void testTwo(){
        String haystack = "mississippi";
        String needle = "issip";
        int expected = 4;

        assertEquals(expected, solution.strStr(haystack,needle));
    }

    @Test
    public void testThree(){
        String haystack = "mississippi";
        String needle = "issipi";
        int expected = -1;

        assertEquals(expected, solution.strStr(haystack,needle));
    }

    @Test
    public void testFour(){
        String haystack = "aaaaa";
        String needle = "bba";
        int expected = -1;

        assertEquals(expected, solution.strStr(haystack,needle));
    }
}



