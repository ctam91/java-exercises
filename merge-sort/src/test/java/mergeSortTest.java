import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class mergeSortTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testOne(){
        int[] nums = new int[] {1,3,4,2};
        int[] expected = new int[] {1,2,3,4};

        assertArrayEquals(expected, solution.mergeSort(nums));
    }
    @Test
    public void testTwo(){
        int[] nums = new int[] {1,4,2,6,8,5,3,7};
        int[] expected = new int[] {1,2,3,4,5,6,7,8};

        assertArrayEquals(expected, solution.mergeSort(nums));
    }
}
