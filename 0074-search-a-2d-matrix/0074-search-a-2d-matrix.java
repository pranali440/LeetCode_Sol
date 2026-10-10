class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
     {
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int row=-1;
     while(top<=bottom)
     {
        int mid=(top+bottom)/2;
        if(target>=matrix[mid][0] && target<=matrix[mid][n-1])
        {
            row=mid;
            break;
        }
        else if(target<matrix[mid][0]){
            bottom=mid-1;
        }else{
            top=mid+1;
        }
     }  
     if(row== -1){
        return false;
     }

     int start=0;
     int end=n-1;
     while(start<=end){
        int mid=(start+end)/2;
        if(target==matrix[row][mid])
        {
            return true;
        } else if(target>matrix[row][mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
     }
     return false;
    }
}