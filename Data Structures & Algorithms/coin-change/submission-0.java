class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int[] dp=new int[amount+1];
        dp[0]=0;
        Arrays.sort(coins);
        for(int i=1;i<=amount;i++)
        dp[i]=Integer.MAX_VALUE;
        for(int i=1;i<=amount;i++)
        {
            for(int k=0;k<coins.length;k++)
            {
                if(coins[k]>i)
                break;
                if(dp[i-coins[k]]!=Integer.MAX_VALUE)
                dp[i]=Math.min(dp[i],dp[i-coins[k]]+1);
            }
        }
        if(dp[amount]>amount)
        return -1;
        return dp[amount];
        
    }
}
