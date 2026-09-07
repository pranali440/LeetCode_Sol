class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
     {
        int m=matrix.length;
        int n=matrix[0].length;
        int c=n-1;
        int r=0;
        while(c>=0 && r<m)
        {
            if(target==matrix[r][c])
            {
                return true;
            }
            else if(target<matrix[r][c])
            {
                c-=1;
            }
            else
            {
                r++;
            }
        } return false;
    }
}