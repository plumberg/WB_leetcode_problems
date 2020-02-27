class Solution {
    public List<Integer> partitionLabels(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            map.put(c, i);
        }
        
        ArrayList<Integer>list = new ArrayList<>();
        int start =0;
        int end = 0;
        
        for(int i=0;i<S.length();i++){
            int currVal = map.get(S.charAt(i));
            end = Math.max(end,currVal);
            
            if(end == i){
                list.add(end-start+1);
                start = i+1;
            }
        }
        return list;
    }
}