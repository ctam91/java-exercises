import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class stockPricesYesterdayTest {
    private StockPrice stockPrice;

    @Before
    public void setup(){
        stockPrice = new StockPrice();
    }


    @Test
    public void testOne() {
        int [] input = new int[] {10, 7, 5, 8, 11, 9};
        int expected = 6;

        assertEquals(expected, stockPrice.stockPricesYesterday(input));
    }

    @Test
    public void testTwo() {
        int [] input = new int[] {0, 4, 5, 9, 5};
        int expected = 9;

        assertEquals(expected, stockPrice.stockPricesYesterday(input));
    }

    @Test
    public void testThree() {
        int [] input = new int[] {0, 4, 5, 9, 20, 27, 29, 1};
        int expected = 29;

        assertEquals(expected, stockPrice.stockPricesYesterday(input));
    }

    @Test
    public void testFour() {
        int [] input = new int[] {29, 45, 36, 1, 5, 11};
        int expected = 16;

        assertEquals(expected, stockPrice.stockPricesYesterday(input));
    }

}
