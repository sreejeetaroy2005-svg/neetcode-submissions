class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        int max=0;
        for(int i=0;i<prices.length;i++)
        max=Math.max(max,prices[i]);
        //max profit till ith day 
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            profit=profit+prices[i+1]-prices[i];

        }
        return profit;
        
    }
}