class Solution {
     private int maxLength=0;
       private int begin=0;
    public String longestPalindrome(String s) 
    {
      
          if(s==null ||s.length()<2){
                return s;
            }
        for(int i=0;i<s.length();i++)
        {
            mid(s,i,i);
            mid(s,i,i+1);
          
        }
        return s.substring(begin,maxLength+begin);
    }

    private void mid(String s,int start,int end)
    {
     while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
     {
        start--;
        end++;
     }

     int length=end-start-1;
     if(maxLength<length)
     {
        maxLength=length;
        begin=start+1;
     }
    }
}