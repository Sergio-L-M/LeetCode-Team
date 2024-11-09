class Solution {
    public int maxProfit(int[] prices) {
        int f1 = -prices[0];
        int f2 = 0;
        int f3 = -prices[0];
        int f4 = 0;
 
        for(int i = 1; i < prices.length; i++){
            f1 = Math.max(f1, -prices[i]);
            f2 = Math.max(f2, f1 + prices[i]);
            f3 = Math.max(f3, f2 - prices[i]);
            f4 = Math.max(f4, f3 + prices[i]);
        }
        return f4;
    }
}