class Solution {
    
    boolean [][]visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j =0; j< board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                   if( searchWord(board, i,j,word,0)) return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean searchWord(char[][] board, int i, int j, String word, int index){
        if(index == word.length()) return true; // word completed
        if(i>board.length-1||i<0||j>board[0].length-1||j<0|| visited[i][j]|| board[i][j]!=word.charAt(index)) return false;
        visited[i][j] = true;
        if(
            searchWord(board, i+1, j, word, index+1)||
            searchWord(board, i-1, j, word, index+1)||
            searchWord(board, i, j+1, word, index+1)||
            searchWord(board, i, j-1, word, index+1)){
            return true;
        }
        
        visited[i][j] = false; // reset to check another method call
        return false;
            
    }
}