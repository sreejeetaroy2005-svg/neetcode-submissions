class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] arr=new int[temperatures.length];
        //for every pos fing from 
        arr[temperatures.length-1]=0;
        for(int i=temperatures.length-2;i>=0;i--)
        {
               int j=i+1;
               while(j<temperatures.length)
               {
                 if(temperatures[j]>temperatures[i])
                 {
                    arr[i]=j-i;
                    break;
                 }
                 j++;
               }

        }
        return arr;
        
    }
}
