class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
	
		Arrays.sort(sChars);
		Arrays.sort(tChars);
		
		return Arrays.equals(sChars,tChars);
    }
   /* public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char [] arr = new char [256];
        
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            int idx = curr - 'a';
            arr[idx]++;
            
            char curr1 = t.charAt(i);
            int idx1 = curr1 - 'a';
            arr[idx1]--;
        }
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }*/
}