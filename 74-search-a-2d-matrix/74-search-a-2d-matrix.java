class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if(mat.length==0) return false;
        int i=0;
        int rows=mat.length-1;
        int cols=mat[0].length-1;
        int j=cols;
        while(i>=0 && i<=rows && j>=0 && j<=cols){
            if(mat[i][j]==target){
                return true;
            }
            else if(mat[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}