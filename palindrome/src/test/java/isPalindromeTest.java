import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class isPalindromeTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        String input = "race car";
        boolean expected = true;

        assertEquals(expected, solution.isPalindrome(input));
    }

    @Test
    public void testTwo(){
        String input = "race a car";
        boolean expected = false;

        assertEquals(expected, solution.isPalindrome(input));
    }

    @Test
    public void testThree(){
        String input = "Mom";
        boolean expected = true;

        assertEquals(expected, solution.isPalindrome(input));
    }

    @Test
    public void testFour(){
        String input = "Aa";
        boolean expected = true;

        assertEquals(expected, solution.isPalindrome(input));
    }

    @Test
    public void testFive(){
        String input = "Aa{*&";
        boolean expected = true;

        assertEquals(expected, solution.isPalindrome(input));
    }
}
