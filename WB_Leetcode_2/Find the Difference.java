class Solution {
    public char findTheDifference(String s, String t) {
        char[]let = new char[26];
        
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            int idx = c-'a';
            let[idx]++;
        }
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = c-'a';
            let[idx]--;
        }
        
        for(int i=0;i<let.length;i++){
            if(let[i]!=0){
                return (char)(i+'a');
            }
        }
        return 'a';
    }
}