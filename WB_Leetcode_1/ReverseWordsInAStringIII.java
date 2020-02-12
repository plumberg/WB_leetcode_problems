class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int counter =0;
        StringBuffer sb = new StringBuffer();
        
        while(counter<words.length){
            String word = words[counter];
            for(int i=word.length()-1;i>=0;i--){
                sb.append(word.charAt(i));
            }
            counter++;
            sb.append(" ");
        }
        
        return sb.deleteCharAt(sb.length()-1).toString();
     
    }
}