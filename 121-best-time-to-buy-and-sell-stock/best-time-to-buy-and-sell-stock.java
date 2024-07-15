class Solution {
    public int maxProfit(int[] prices) {
        int buy_day = Integer.MAX_VALUE;
        int selling_day = 0;

        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < buy_day)
            {
                buy_day = prices[i];
            }
            else if(prices[i] - buy_day > selling_day)
            {
                selling_day = prices[i] - buy_day;
            }
        }
        return selling_day;
    }
}