class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
       String binary = String.format("%8s",
        Integer.toBinaryString(s.charAt(i))).replace(' ', '0');
    str.append(binary);

    }
    int start=0;
    int end=str.length()-1;
    while(start<end)
    {
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }else{
            start++;
            end--;
        }
    }  
  
    return true;
    }
}