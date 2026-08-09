class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int left=0;
        int right=0;
        int count=0;
        int result=1;

        if(k<=1){
            return 0;
        }
        for(right=0;right<nums.length;right++)
        {
             result=result*nums[right];
            
            while(result>=k)
            {
                result=result/nums[left];
                left++;
            }
            count+=right-left+1;
        } return count;
    }
}