class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int pLen = p.length();
        int[] constantAnagram = new int [26];
        for(int i=0;i<pLen;i++){
            constantAnagram[p.charAt(i)-'a']++;
        }
        
        for(int i=0;i<=s.length()-pLen;i++){
        	String piece = s.substring(i,i+pLen);
            int[] tempAnagram = new int[26];
            for(int j=0;j<pLen;j++){
                tempAnagram[piece.charAt(j)-'a']++;
            }
            if(Arrays.equals(constantAnagram, tempAnagram)) list.add(i);
        }
        return list;
}
}