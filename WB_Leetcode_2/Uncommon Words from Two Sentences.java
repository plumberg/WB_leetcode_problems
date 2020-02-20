class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();
        
        String []aSep = A.split(" ");
        String []bSep = B.split(" ");
        
        for(String aword: aSep){
            if(map.containsKey(aword)){
                map.put(aword, map.get(aword)+1);
            }else map.put(aword,1);
        }
        
        for(String bword: bSep){
            if(map.containsKey(bword)){
                map.put(bword, map.get(bword)+1);
            }else map.put(bword,1);
        }
        
        ArrayList<String>out = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) out.add(entry.getKey());
        }
        
        String[] arr = new String[out.size()]; 
        arr = out.toArray(arr); 
        
        return arr;
    }
}