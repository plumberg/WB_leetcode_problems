class Solution {
    //Recursive:
    public int maxProfit(int[] prices) {
        if(prices.length < 1 ) return prices.length;
        return maxRecursive(0,prices,0);
    }
    public int maxRecursive(int startIdx, int[]prices, int profit){
        if(startIdx == prices.length-1) return profit; //Loop is over
        
        for(int i = startIdx; i< prices.length;i++){
            int diff = prices[i] - prices[startIdx];
            if(diff > profit) profit = diff;
        }
        startIdx++;
        return maxRecursive(startIdx, prices, profit);
    }
    
    //Other:
    public int maxProfit(int[] prices) {
        int profit =0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) min = prices[i];
            else if(prices[i]-min>profit) profit = prices[i]-min;
        }
        
        return profit;
    }
    
    public int maxProfit1(int[] prices) {
        int profit =0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }
        
        return profit;
    }
}