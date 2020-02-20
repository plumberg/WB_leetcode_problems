class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>set = new HashSet<>();
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
            char c = board[i][j];
                if(c!='.'){
                    if(!set.add(c+"in the row"+i)||
                       !set.add(c+"in the col"+j)||
                       !set.add(c+"in the box"+i/3+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}