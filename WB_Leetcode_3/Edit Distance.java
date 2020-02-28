class Solution {
    public int minDistance(String word1, String word2) {
        int [][] chart = new int [word1.length()][word2.length()];
        
        return minDistance(chart, word1, word2, 0,0);
    }
    
    public static int minDistance(int [][] chart, String word1, String word2, int i, int j) {
		if(i == word1.length()) 
			return word2.length() - j;
		if(j == word2.length()) 
			return word1.length() - i;
		
		if(chart[i][j]>0) 
			return chart[i][j];
		
		int res; 
		char w1 = word1.charAt(i);
		char w2 = word2.charAt(j);
		if(w1 == w2) {
			return minDistance(chart, word1, word2, i+1, j+1);
		}else {
			res = 1+ minDistance(chart, word1, word2, i+1, j+1);
			
			res = Math.min(res, 1+ minDistance(chart, word1, word2, i+1, j));
			
			res = Math.min(res, 1+ minDistance(chart,word1, word2, i, j+1));
		}
		
		chart[i][j] = res;
		return res;
	}
}