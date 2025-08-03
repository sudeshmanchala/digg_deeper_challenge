class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[prices.length-1];
        int maxprofit=0;
        int profit=0;
        for(int i=prices.length-2;i>=0;i--){
            profit=max-prices[i];
            if(max<prices[i]){
                max=prices[i];
            }
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
