class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int total=nums.length;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==val)
            {  total--;
               for(int k=i+1;k<len;k++)
               {
                  nums[k-1]=nums[k];
               }
               len--;
               i--;
            }
        }
        return total;
        
    }
}