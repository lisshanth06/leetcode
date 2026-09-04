class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxprofit = 0;
        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            else{
                if(maxprofit<prices[i]-min){
                    maxprofit = prices[i]-min;
                }
            }
        }
        return maxprofit;
    }
}