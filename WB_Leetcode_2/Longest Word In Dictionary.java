class Solution {
    public String longestWord(String[] words) {
        TrieNode node = new TrieNode();
        for(String word:words){
            TrieNode currNod = node;
            for(char c : word.toCharArray()){
                int idx = c - 'a';
                if(currNod.leaves[idx] == null){
                    currNod.leaves[idx] = new TrieNode();
                }
                currNod = currNod.leaves[idx];
            }
            currNod.word = word;
            currNod.endOfWord = true;
        }
        String s = dfs(node);
        return s;
    }
    
    public String dfs(TrieNode node){
        String s = node.word;
        for(TrieNode leaf :node.leaves){
            if(leaf == null||leaf.word == null){
                continue;
            }
            String nextLeaf = dfs(leaf);
            if(s == null){
                s = nextLeaf;
            }else if(nextLeaf!=null&&nextLeaf.length()>s.length()){
                s = nextLeaf;
            }
        }
        return s;
        
    }
}

/*class Trie{
    TrieNode nod;
    
    public Trie(){
        nod = new TrieNode;
    }
    
    public void insert(String word){
        
    }
}*/

class TrieNode{
	public TrieNode[] leaves;
	public boolean endOfWord;
	public String word;
	public TrieNode() {
		leaves = new TrieNode[26];
		endOfWord = false;
	}
}