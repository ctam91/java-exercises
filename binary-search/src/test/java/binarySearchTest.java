import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class binarySearchTest {
    private BinarySearch binarySearch;

    @Before
    public void setUp(){
        binarySearch = new BinarySearch();
    }

    @Test
    public void testOne(){
        int[] input = new int[] {1,3,4,5,13,20,25,40,42,44,53};
        int left = 0;
        int right = input.length-1;
        int numToFind = 13;
        int expected = 4;

        assertEquals(expected,binarySearch.binarySearch(input,numToFind,left,right));
    }

    @Test
    public void testTwo(){
        int[] input = new int[] {1};
        int left = 0;
        int right = input.length-1;
        int numToFind = 1;
        int expected = 0;

        assertEquals(expected,binarySearch.binarySearch(input,numToFind,left,right));
    }
}
