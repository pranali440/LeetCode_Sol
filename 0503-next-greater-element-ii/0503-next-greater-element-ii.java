class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n=nums.length;
        int result[]=new int[n];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<n;i++)
        {
            result[i]=(-1);
        }
        for(int i=2*n-1;i>=0;i--)
        {
            int index = i % n;
            while(!s1.isEmpty() && s1.peek()<=nums[index])
            {
                s1.pop();
            }
            if(!s1.isEmpty())
            {
                result[index]=s1.peek();
            }
        s1.push(nums[index]);
        }return result;
    }
}