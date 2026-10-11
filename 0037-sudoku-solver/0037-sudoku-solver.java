class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
      boolean solve(char[][] board){
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char k ='1';k<='9';k++){
                        if(isvalid(k,i,j,board)){
                            board[i][j]=k;
                            if(solve(board)==true){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isvalid(int value,int row, int col,char[][] board){
        for(int i=0;i<9;i++){
            if(board[i][col]==value){
                return false;
            }
            if(board[row][i]==value){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==value){
                return false;
            }
        }
        return true;
    }
}