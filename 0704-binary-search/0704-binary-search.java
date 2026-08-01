class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int mid=nums.length/2;
        int end=nums.length-1;

        while(start<=end)
        {
            if(target==nums[mid])
            {
            return mid;
                 }
            if(target<nums[mid])
            {
                end=mid-1;
              mid=start+(end-start)/2;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            mid=start+(end-start)/2;
            }
        }
        return -1;
    } 
}