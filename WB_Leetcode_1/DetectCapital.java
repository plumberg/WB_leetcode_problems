class Solution {
    public boolean detectCapitalUse(String word) {
        int counter = 0;
        for(int i = 0; i< word.length();i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                counter++;
            }
        }
        if(counter == 0) return true;
        else if (counter == 1 && Character.isUpperCase(word.charAt(0))) return true;
        else if(counter == word.length()) return true;
        else return false;
    }
}