class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][]=new int[m][n]; 
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return possibleuniquepath(m-1,n-1,dp,grid);
    }
    static int possibleuniquepath(int m , int n,int dp[][],int grid[][]){
        if(m==0 && n==0){
            return grid[0][0] ;
        }
        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int up= possibleuniquepath(m-1,n,dp,grid);
        int left=possibleuniquepath(m,n-1,dp,grid);
        return dp[m][n]=grid[m][n]+Math.min(up,left);
        
    }
}