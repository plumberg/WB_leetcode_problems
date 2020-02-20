class Solution {
     HashSet<String> set = new HashSet<>();
    public List<String> findWords(char[][] board, String[] words) {
        
        TrieNode nod = new TrieNode();
        boolean [][] flag = new boolean[board.length][board[0].length];
        
        insert(nod,words);
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,nod,flag,"");
            }
        }
        return new ArrayList(set);
    }
    public void dfs(char[][] board, int i,int j, TrieNode nod, boolean[][]flag, String s){
        if(i<0||i>=board.length||j<0||j>=board[0].length||flag[i][j]==true) return;
        int idx = board[i][j]-'a';
        if(nod.nod[idx]==null)return;
        
        flag[i][j] = true;
        nod = nod.nod[idx];
        if(nod.endOfWord==true) set.add(s+board[i][j]);
        
        dfs(board,i+1,j,nod,flag,s+board[i][j]);
        dfs(board,i-1,j,nod,flag,s+board[i][j]);
        dfs(board,i,j+1,nod,flag,s+board[i][j]);
        dfs(board,i,j-1,nod,flag,s+board[i][j]);
        
        flag[i][j] = false;
    }
    public void insert(TrieNode nod, String[]words){
       
        for(String word: words){
            TrieNode n=nod;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                int idx = c - 'a';
                if(n.nod[idx]==null)n.nod[idx]=new TrieNode();
                n = n.nod[idx];
            }
            n.endOfWord = true;
        }
    }
}

class TrieNode{
    TrieNode[] nod;
    boolean endOfWord;
    public TrieNode(){
        nod = new TrieNode[26];
        endOfWord = false;
    }
}