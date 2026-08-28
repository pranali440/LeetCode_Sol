class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
       int n=nums.length;
       int num[]=new int[n-k+1];
        Deque<Integer>deq=new LinkedList<>();
        for(int right=0;right<n;right++)
        {
            while(!deq.isEmpty() && deq.peekFirst()<=right-k)
            {
                deq.pollFirst();
            }
            while(!deq.isEmpty() && nums[deq.peekLast()]<nums[right])
            {
               deq. pollLast();
            }
    deq.addLast(right);
    if(right>=k-1)
    {
        num[right-k+1]=nums[deq.peekFirst()];
    }
        }
        return num;
    }
}