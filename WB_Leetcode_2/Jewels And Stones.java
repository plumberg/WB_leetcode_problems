class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter =0;
        for(int i=0;i<S.length();i++){
            if(isJewel(J,S.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
    
    public boolean isJewel(String J, char S){
        char[]jewels = J.toCharArray();
        for(int i=0;i<jewels.length;i++){
            if(jewels[i]==S) return true;
        }
        return false;
    }
    
}