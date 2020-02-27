class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
		ArrayList<Integer>list = new ArrayList<>();
		char[] pChars = p.toCharArray();
		Arrays.sort(pChars);
		String pPiece = new String(pChars);
		for(int i=0;i<=s.length()-p.length();i++) {
			String subOfS = s.substring(i,i+p.length());
			char [] sChars = subOfS.toCharArray();
			Arrays.sort(sChars);
			String sPiece = new String(sChars);
			if(sPiece.compareTo(pPiece)==0) 
					list.add(i);
		}
		
		return list;
	}
    
    /*public List<Integer> findAnagrams(String s, String p) {
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
    }*/
}