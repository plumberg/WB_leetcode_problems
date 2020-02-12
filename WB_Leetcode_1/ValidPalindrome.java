class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() ==1) return true;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                list.add(Character.toString(c).toLowerCase());
            }
        }
        
        for(int i=0;i<list.size()/2;i++){
            if(list.get(i).compareTo(list.get(list.size()-1-i))==0){
                continue;
            }else return false;
        }
        return true;
    }
}