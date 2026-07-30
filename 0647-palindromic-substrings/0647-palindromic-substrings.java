class Solution {
    public int countSubstrings(String s) 
    {
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
         for(int j=i;j<s.length();j++)
         {
                String str=s.substring(i,j+1);
                int start=0;
                int end=str.length()-1;
                 boolean isPalindrome = true;

                while(start<end)
                {
                    if(str.charAt(start)!=str.charAt(end))
                    {
                        isPalindrome = false;
                         break;
                    }
                     
                
                   start++;
                    end--; 
                }
                    if(isPalindrome)
                    {
                            count++;
                    }
          
        }
            }
        return count;
    }
   
    
}