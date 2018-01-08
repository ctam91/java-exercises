import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class isPermutationTest {

    private StringPermutation stringPermutation;

    @Before
    public void setUp(){
        stringPermutation = new StringPermutation();
    }

    @Test
    public void testOne(){
        String input1 = "apple";
        String input2 = "paple";
        boolean expected = true;

        assertEquals(expected,stringPermutation.isPermutation(input1,input2));
    }

    @Test
    public void testTwo(){
        String input1 = "hello world";
        String input2 = "dlrow lloeh";
        boolean expected = true;

        assertEquals(expected,stringPermutation.isPermutation(input1,input2));
    }

    @Test
    public void testThree(){
        String input1 = "pineapple";
        String input2 = "paple";
        boolean expected = false;

        assertEquals(expected,stringPermutation.isPermutation(input1,input2));
    }

    @Test
    public void testFour(){
        String input1 = "Apples";
        String input2 = "AppleS";

        boolean expected = true;
        assertEquals(expected, stringPermutation.isPermutation(input1, input2));
    }
}
