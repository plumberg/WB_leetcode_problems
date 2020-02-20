class Solution {
    public int numSpecialEquivGroups(String[] A) {
        if(A.length==0||A.length==1) return A.length;
        
        HashSet<String> set = new HashSet<>();
        for(String word:A){
            int [] arr = new int[52];
            for(int i=0;i<word.length();i++){
                int idx = word.charAt(i)-'a';
                int evod = 26*(i%2);
                arr[idx+evod]++;
            }
            set.add(Arrays.toString(arr));
        }
        return set.size();
        
    }
   /* public int numSpecialEquivGroups(String[] A) {
        if(A.length==0||A.length==1) return A.length;

        HashSet<String> set = new HashSet<>();
        
        for(String word:A){
            String even="";
            String odd="";
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                if(i%2==0) even+=c;
                else odd +=c;
                
            }
            even = sortIt(even);
            odd = sortIt(odd);
            set.add(even+odd);
        }
        return set.size();
    }
    
    public String sortIt(String s){
        char [] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }*/
}