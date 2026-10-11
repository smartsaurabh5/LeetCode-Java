import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board= new char[n][n];
        for(int i =0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
         int col=0;
         int leftrow[]= new int[n];
         int upperdiagonal[]= new int[2*n-1];
         int lowerdiagonal[]= new int[2*n-1];

         List<List<String>> ans = new ArrayList<>();
         solve(n,col,board,ans,leftrow,upperdiagonal,lowerdiagonal);
         return ans;
        
    }
    static void solve(int n , int col,char[][] board,List<List<String>>ans,int[] leftrow, int[] upperdiagonal, int[]lowerdiagonal){
        if(col==n){
            List<String> currentboard=new ArrayList<>();
            for(int i =0;i<n;i++){
                currentboard.add(new String(board[i]));
            }
            ans.add(new ArrayList<>(currentboard));
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && upperdiagonal[n-1+col-row]==0&& lowerdiagonal[row+col]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                upperdiagonal[n-1+col-row]=1;
                lowerdiagonal[row+col]=1;
                solve(n,col+1,board,ans,leftrow,upperdiagonal,lowerdiagonal);
                board[row][col]='.';
                leftrow[row]=0;
                upperdiagonal[n-1+col-row]=0;
                lowerdiagonal[row+col]=0;
            }
        }
    }
}