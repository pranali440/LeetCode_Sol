class Solution 
{
    public int[] twoSum(int[] nums, int target)
     {
           
            
                for(int i=0;i<nums.length;i++)
                {
                    int j=nums.length-1;
                        while(i<j)
                        {
                            if(nums[i]+nums[j]==target)
                            { return new int[] {i,j}; }
                            else{j--;}
                }      
                        } return new int[] {-1};
     }

       
    
}