class Solution {
    public String longestCommonPrefix(String[] strs) {
	        if(strs.length == 0) return ""; 
            
            String wordOne = strs[0];
            for(int i=1;i<strs.length;i++){
                while(strs[i].indexOf(wordOne)!=0){
                    wordOne = wordOne.substring(0, wordOne.length()-1);
                }   
                
            }
        return wordOne;
	    }
}
