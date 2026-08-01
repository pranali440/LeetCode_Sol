class Solution {
    public void sortColors(int[] nums) 
    {
        int zero=0;
        int one=0;
        int two=0;

       for(int i=0;i<nums.length;i++)
     {
        if(nums[i]==0){
            zero++;
        }
        else if(nums[i]==1){
            one++;
        }
        else if(nums[i]==2){
            two++;
        }

        }  
        int i=0;
       // int index=0;
        while(zero>0)
        {
            nums[i]=0;
            zero--;
            i++;        
        } 
        while(one>0)
        {
            nums[i]=1;
            one--;
            i++; 
        }   
        while(two>0)
        {
            nums[i]=2;
            two--;
            i++; 
        }    
        
    }

}