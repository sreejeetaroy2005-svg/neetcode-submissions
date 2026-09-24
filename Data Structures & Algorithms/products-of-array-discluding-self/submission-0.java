class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] ans1=new int[nums.length];
        int prev=1;
        for(int i=0;i<nums.length;i++)
        {
            ans1[i]=prev;
            prev=prev*nums[i]; 
        }
        int[] ans2=new int[nums.length];
        int next=1;
        for(int j=nums.length-1;j>=0;j--)
        {ans2[j]=next;
        next=next*nums[j];}
        int[] total=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        total[i]=ans1[i]*ans2[i];

        return total; 


    }
}  
