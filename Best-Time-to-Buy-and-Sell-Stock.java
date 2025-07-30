class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int minidx=0;
        int maxidx=0;
        int max = prices[0];
        int n = prices.length;
          int profit=0;
        for(int i=0; i<n; i++){
            if(prices[i]<min){
                min = prices[i];
                minidx = i;
            }
            if(prices[i]-min > profit && minidx < i){
                profit = prices[i]-min;
                maxidx=i;
            }
        }
        return profit;
    }
}