class Solution {
    public boolean isSubsequence(String s, String t) {
        int sStart =0;
        int sEnd = s.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++){
            if(sStart<=sEnd && s.charAt(sStart)==t.charAt(i)){
                
                    sb.append(s.charAt(sStart));
                    sStart++;
                
            }
        }
        return sb.toString().length()==s.length()?true:false;
    }
}