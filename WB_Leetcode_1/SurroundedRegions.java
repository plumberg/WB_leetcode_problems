class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        
       for(int i =0; i< board[0].length;i++){
           if(board[0][i] == 'O'){
               methodDFS(board, 0, i);
           }
           if(board[board.length-1][i] == 'O'){
               methodDFS(board, board.length-1, i);
           }
       }
        
        for(int i=0;i<board.length;i++){
            if(board[i][0] == 'O'){
                methodDFS(board, i, 0);
            }
            if(board[i][board[0].length-1] == 'O'){
                methodDFS(board, i, board[0].length-1);
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j]=='*'){
                    board[i][j] = 'O';
                }
            }
        }

    }
    
    private static void methodDFS(char[][] board, int i, int j) {
		if((i<0 ||i>board.length-1||j<0||j>board[0].length-1)||board[i][j]=='x') {
			return;
		}
        if(board[i][j]=='O'){
            board[i][j] = '*';
        }
        if(i>0 && board[i-1][j] == 'O'){
            methodDFS(board, i-1, j);
        }
        if(i<board.length-1 && board[i+1][j]=='O'){
            methodDFS(board, i+1, j);
        }
        if(j>0 && board[i][j-1]=='O'){
            methodDFS(board, i, j-1);
        }
        if(j < board[0].length-1 && board[i][j+1]=='O'){
            methodDFS(board, i, j+1);
        }
		
	}
}