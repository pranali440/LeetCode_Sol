class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles)
        {
            high=Math.max(high,pile);
        }

        while(low<high)
        {
            int mid=low+(high-low)/2;
            int needHours=calculateNeedH(piles,mid);
            if(needHours<=h){
                high=mid;
            }else{
               low=mid+1;
            }
        }
        return low;
    }
    public static int calculateNeedH(int piles[],int speed)
    {
        int hour=0;
        for(int pile:piles){
            hour+=(pile+speed-1)/speed;
        }
        return hour;
    }
}