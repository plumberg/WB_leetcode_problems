class Solution {
    public String frequencySort(String s) {
        if(s.length()<2)return s;
        
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else map.put(c,1);
        }
        
        LinkedList<Map.Entry<Character,Integer>>list = 
            new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer>arg1, Map.Entry<Character,Integer>arg2){
                return arg2.getValue().compareTo(arg1.getValue());
            }
        });
        
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<Character,Integer>entry:list){
            if(entry.getValue()>1){
                for(int i=0;i<entry.getValue();i++){
                    sb.append(entry.getKey());
                }
            }else sb.append(entry.getKey());
        }
        
        return sb.toString();
    }
}