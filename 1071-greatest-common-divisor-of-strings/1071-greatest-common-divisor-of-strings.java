class Solution {
    
    public String gcdOfStrings(String str1, String str2) {
       int len= gcd(str1.length(),str2.length());
      String candidate=str1.substring(0,len);


if(isDivisible(str1,candidate) && isDivisible(str2,candidate)){
    return candidate;
}
return "";
    }
         //(18,12)
        public int gcd(int a,int b)
         {
                while(b!=0)
                {
                    int rem=a%b; 
                    int temp=b;
                    b=rem;
                    a=temp;
                }
                return a;
         }
         public boolean isDivisible(String str,String candidate)
         {
         StringBuilder sb=new StringBuilder();
          int n=str.length()/candidate.length();

          for(int i=0;i<n;i++){
            sb.append(candidate);
          }
          return sb.toString().equals(str);
         }
    }
       