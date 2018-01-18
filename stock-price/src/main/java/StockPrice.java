
public class StockPrice {
    public int stockPricesYesterday(int[] prices){

        /*int minPrice = prices[0];
        int maxProfit = prices[1] - prices[0];

        if(prices.length < 2){
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }
        for(int i = 1; i < prices.length; i++){
            int currentPrice = prices[i];
            int profit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;
        */
        if(prices.length < 2 || prices == null){
            return 0;
        }

        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - prices[i-1];
            if(profit > 0){
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}
