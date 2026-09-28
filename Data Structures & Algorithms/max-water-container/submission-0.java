class Solution {
    public int maxArea(int[] heights) 
    {
        int max=Integer.MIN_VALUE;
        int vol=0;
        int start=0;
        int end=heights.length-1;
        while(start<end)
        {
             int curr_vol=Math.min(heights[start],heights[end])*(end-start);
             vol=Math.max(curr_vol,vol);
             if(heights[start]<heights[end])
             start++;
             else
             end--;
        }
        return vol;
        
    }
}
