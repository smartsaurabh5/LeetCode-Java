class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n]; 
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return possibleuniquepath(m-1,n-1,dp);
    }
    static int possibleuniquepath(int m , int n,int dp[][]){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int up=possibleuniquepath(m-1,n,dp);
        int left=possibleuniquepath(m,n-1,dp);
        return dp[m][n]=up+left;
    }
}