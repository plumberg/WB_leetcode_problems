class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
	        		".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	       HashSet<String> set = new HashSet<>();
	        for(int i=0;i<words.length;i++){
	            String w = words[i];
	            StringBuilder sb = new StringBuilder();
	            for(int j=0;j<w.length();j++){
	                int index = w.charAt(j)-'a';
	                sb.append(morse[index]);
	            }
	            set.add(sb.toString());
	        }
	        
	        return set.size();
    }
}