class Solution {
    public int trap(int[] height)
     {
        int trapped_water=0;
       int left[]=leftMax(height);
       int right[]=rightMax(height);
        for(int i=0;i<height.length;i++)
        {  
       int water_level=Math.min(left[i],right[i]);
         trapped_water+=water_level-height[i];
        }
        return trapped_water;
    }
    private int[] leftMax(int height[])
    {
            int left[]=new int[height.length];
            left[0]=height[0];
        for(int i=1;i<height.length;i++)
                {
                left[i] = Math.max(height[i], left[i-1]);
                }
        
        return left;
    }
     private int[] rightMax(int height[])
    {
         int right[]=new int[height.length];
           right[right.length-1]=height[height.length-1];
           
        for(int i=height.length-2;i>=0;i--)
        {
        right[i]=Math.max(right[i+1],height[i]);
        }
        return right;
    }
}
