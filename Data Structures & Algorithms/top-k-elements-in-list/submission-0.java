class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(!(map.containsKey(nums[i])))
             map.put(nums[i],1);
           else
           {
              int curr=map.get(nums[i]);
              map.remove(nums[i]);
              map.put(nums[i],curr+1);
           }
           
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];

for (int i = 0; i < k; i++) {
    ans[i] = list.get(i).getKey();
}
return ans;
       
}
        
    }

