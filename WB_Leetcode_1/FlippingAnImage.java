class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        
        for(int i=0;i<rows;i++){
            int endCol = A[0].length-1;
            for(int j=0;j<cols/2;j++){     
                int temp = A[i][endCol];
                A[i][endCol] = A[i][j];
                A[i][j]=temp;
                endCol--;
            }
            
            
        }
        
         for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		if(A[i][j]==1) A[i][j] = 0;
        		else A[i][j]=1;
        	}
        }
        return A;
        
    }
}