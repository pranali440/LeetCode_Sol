class Solution {
    public int climbStairs(int n) 
    {
        int prev=1;
        int next=2;
        if(n<=2){
            return n;
        }
        for(int i=3;i<=n;i++){

            int temp=prev+next;
            prev=next;
            next=temp;
        }
        return next;
        
    }
}