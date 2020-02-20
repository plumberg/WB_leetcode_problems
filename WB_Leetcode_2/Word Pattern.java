class Solution {
    public boolean wordPattern(String pattern, String str) {
        String [] strArr = str.split(" ");
        if(strArr.length!=pattern.length())return false;
        
        HashMap<Character, String>map = new HashMap<>();
        
        for(int i=0;i<strArr.length;i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(map.containsValue(strArr[i])) 
                                    return false;
                map.put(c,strArr[i]);
            }else if(!map.get(c).equals(strArr[i])) 
                                    return false;
            
        }
        return true;
    }
}