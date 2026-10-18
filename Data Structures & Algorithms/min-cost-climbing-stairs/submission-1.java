class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {
        int[] dp=new int[cost.length+1];
        if(cost.length==0)
        return 0;
        if(cost.length==1)
        return cost[0];
        if(cost.length==2)
        return Math.min(cost[1],cost[0]);
        dp[0]=0;
        dp[1]=cost[0];
        dp[2]=cost[1];
        for(int i=3;i<=cost.length;i++)
        {
           dp[i]=Math.min(dp[i-2],dp[i-1])+cost[i-1];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length]);
    }
}
