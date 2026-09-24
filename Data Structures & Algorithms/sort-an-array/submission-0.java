class Solution {
    public int[] sortArray(int[] nums) 
    {

        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
    private void mergesort(int[] nums,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }

    }
    private void merge(int[] nums,int low,int mid,int high)
    {
        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            nums[i] = temp[k];
        }
    }
}