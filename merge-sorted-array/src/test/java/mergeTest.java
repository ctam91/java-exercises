import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class mergeTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        int[] a = new int[] {2,0};
        int m = 1;
        int[] b = new int[] {1};
        int n = 1;
        int[] expected = new int[] {1,2};

        assertArrayEquals(expected, solution.merge(a,m,b,n));
    }

    @Test
    public void testTwo(){
        int[] a = new int[] {1,2,3,0,0,0,0};
        int m = 3;
        int[] b = new int[] {4,5,6,7};
        int n = 4;
        int[] expected = new int[] {1,2,3,4,5,6,7};

        assertArrayEquals(expected, solution.merge(a,m,b,n));
    }

}
