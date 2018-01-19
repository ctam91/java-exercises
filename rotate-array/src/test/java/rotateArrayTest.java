import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class rotateArrayTest {
    private RotateArray manager;

    @Before
    public void setUp(){
        manager = new RotateArray();
    }

    @Test
    public void testOne(){
        int[] nums = new int[] {1,2,3};
        int k = 1;
        int[] expected = new int[] {3,1,2};
        assertArrayEquals(expected, manager.rotateArray(nums, k));
    }

    @Test
    public void testTwo(){
        int[] nums = new int[] {1,2};
        int k = 2;
        int[] expected = new int[] {1,2};
        assertArrayEquals(expected, manager.rotateArray(nums, k));
    }

    @Test
    public void testThree(){
        int[] nums = new int[] {5,7,3,9};
        int k = 2;
        int[] expected = new int[] {3,9,5,7};
        assertArrayEquals(expected, manager.rotateArray(nums, k));
    }
}
