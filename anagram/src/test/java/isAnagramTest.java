import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class isAnagramTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        String input = "ab";
        String input2 = "a";
        boolean expected = false;

        assertEquals(expected, solution.isAnagram(input,input2));
    }

    @Test
    public void testTwo(){
        String input = "carter";
        String input2 = "crater";
        boolean expected = true;

        assertEquals(expected, solution.isAnagram(input,input2));
    }
}
