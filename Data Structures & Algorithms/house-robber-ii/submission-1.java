class Solution {
    public int rob(int[] nums) 
    {
        int[] dp1=new int[nums.length+1];
        if (nums.length == 1)
        return nums[0];
        //first exclude 1st house
        dp1[0]=0;
        dp1[1]=0;
        for(int i=2;i<nums.length+1;i++)
        {
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i-1]);
        }
        //skipping laast
        int[] dp2=new int[nums.length+1];
        dp2[0]=0;
        dp2[1]=nums[0];
        for(int i=2;i<nums.length;i++)
        {
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i-1]);
        }
        return Math.max(dp1[nums.length],dp2[nums.length-1]);
    






        

        
    }
}
