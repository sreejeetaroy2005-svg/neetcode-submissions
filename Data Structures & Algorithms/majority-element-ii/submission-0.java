class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                map.put(nums[i], ++count);

                if(count >nums.length/3)
                    list.add(nums[i]);

                if(list.size() == 2)
                    return list;

                count = 0;
            }
            else
                count++;
        }
        count++;

        if(count > nums.length/3)
            list.add(nums[nums.length-1]);

        return list;
    }
}