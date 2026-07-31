class Solution {
    public List<List<Integer>> threeSum(int[] nums)
    
     {
        /*
    List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int result=nums[i]+nums[j]+nums[k];
                    if(result==0){
                       
             List<Integer> l1 = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(l1);
                            if(!ans.contains(l1)){
                            ans.add(l1);
                            }
                        
                    }
                }
            }
        }return ans;
*/

//optimize solution

 List<List<Integer>> ans=new ArrayList<>();
            Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++)
      {
        int end=nums.length-1;
            int start=i+1;
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
                 while(start<end)
             {

                 int result=nums[i]+nums[start]+nums[end];
                        if(result<0){
                            start++;
                        }else if(result>0){
                            end--;
                        }
                else
            {
             List<Integer>l1=Arrays.asList(nums[i],nums[start],nums[end]);
             ans.add(l1);
             start++;
                end--;
    
         while(start<end && nums[start]==nums[start-1])
             { start++;
             }
         while(start<end && nums[end]==nums[end+1])
             { 
                end--;
             }
                        }
    
             }
      }return ans;

    }
}