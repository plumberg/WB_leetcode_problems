class Solution {
    public int titleToNumber(String s) {
        int out =0;
        for(int i=0;i<s.length();i++){
            out *=26; // if more than single character length passed
            int diff = s.charAt(i)-'A';
            out += diff+1;
        }
        
        return out;
    }
}