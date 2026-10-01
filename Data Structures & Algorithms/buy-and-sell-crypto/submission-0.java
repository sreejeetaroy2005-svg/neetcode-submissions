class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        //make array habing min to left for each
        int arr[]=new int[prices.length];
        arr[0]=prices[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=Math.min(prices[i],arr[i-1]);
        }
        for(int i=prices.length-1;i>=0;i--)
        {
            profit=Math.max(profit,prices[i]-arr[i]);
        }
        return profit;
        
    }
}
