class Solution {
    public int mySqrt(int x)
     {
        int i=1;
        long ans=1;
        if(x==0)
        {
            return 0;
        }
      while(true) 
      {
         ans=(long)i*i;
                if(ans==x)
                {
                    return i;
                }
                else if(ans<x)
                {
                    i++;
                }else if(ans>x)
                {
                    return i-1;
                }
                
      }
    
    }
}