class Solution {
    public void rotate(int[] nums, int k) 
   
    {
      int n = nums.length;
      k = k % n;
        rotateHelper(nums,0,n-1);
        rotateHelper(nums,0,k-1);
        rotateHelper(nums,k,n-1);
        
      
    }
    public void rotateHelper(int num[],int start,int end)
    {
       
        int temp=0;
      while(start<end)
        {
             temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    
}