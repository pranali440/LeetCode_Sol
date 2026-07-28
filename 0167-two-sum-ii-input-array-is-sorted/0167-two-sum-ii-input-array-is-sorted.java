class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right=numbers.length-1;
       int left=0;
       int arr[]=new int[2];
       while(left<numbers.length && right>=0)
       {
        int res=numbers[left]+numbers[right];
                if(res==target)
                {
                arr[0]=++left;
                arr[1]=++right;
                break;
                }
                   else if(target<res)
                {  right--;}
                else
                {
                    left++;
                }
        }
        return arr;
    }
}