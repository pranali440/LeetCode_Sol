class Solution {
    public boolean sumGame(String num) 
    {
        int start=0;
        int end=num.length();
        int mid=start+(end-start)/2;
            int rightSum=0;
            int leftSum=0;
            int rightQ=0;
            int leftQ=0;
         for(int i=0;i<mid;i++)
        {
           if(num.charAt(i)=='?')
           {
            leftQ++;
           } else
           {
            leftSum+=num.charAt(i)-'0';
           }
        }

        for(int i=mid;i<num.length();i++)
        {
            if(num.charAt(i)=='?')
           {
            rightQ++;
           }
            else
            {
                   rightSum += num.charAt(i) - '0';
           }
        }

        int total=leftQ+rightQ;
        if(total%2==1)
        {
            return true;
        }
    
        int pair=(leftQ-rightQ)/2;
    
         return (leftSum - rightSum) != -9 * pair; 
        
        
    
    }
}