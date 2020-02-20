class Trie {

   private TrieNode nod;
	
	
	/** Initialize your data structure here. */
    public Trie() {
        nod = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode n = nod;
        for(int i=0;i<word.length();i++) {
        	int idx = word.charAt(i)-'a';
        	if(n.leaves[idx]==null) {
        		n.leaves[idx] = new TrieNode();
        	}
        	n = n.leaves[idx];
        }
        n.endOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	TrieNode n = nod;
        for(int i=0;i<word.length();i++) {
        	int idx = word.charAt(i)-'a';
        	if(n.leaves[idx]==null) return false;
        	n = n.leaves[idx];
        }
        return n.endOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
      public boolean startsWith(String prefix) {
         TrieNode prefNod = find(prefix);
        return prefNod!= null;
    }
    
    private TrieNode find(String word) {
       TrieNode n = nod;
        for(int i=0;i<word.length();i++) {
        	int idx = word.charAt(i)-'a';
        	if(n.leaves[idx]==null) return null;
        	n = n.leaves[idx];
        }
        return n;
    }
}

class TrieNode{
	public TrieNode[] leaves;
	public boolean endOfWord;
	
	public TrieNode() {
		leaves = new TrieNode[26];
		endOfWord = false;
	}
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */