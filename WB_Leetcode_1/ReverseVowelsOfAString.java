class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        //sb.setCharAt(2, 'i');
        //a, e, i, o, u
        int counter1=0;
        int counter2=s.length()-1;

       
        while(counter1<counter2){
            
            
            if(checkVowel(s.charAt(counter1)) && checkVowel(s.charAt(counter2))){
                sb.setCharAt(counter1, s.charAt(counter2));
                sb.setCharAt(counter2, s.charAt(counter1));
                counter1++;
                counter2--;
            }
            else if(!checkVowel(s.charAt(counter1))){
                counter1++;
            }else if(!checkVowel(s.charAt(counter2))){
                counter2--;
            }
            
        }
        
        return sb.toString();
    }
    
    public boolean checkVowel(char c){
        c = Character.toLowerCase(c);
        return  c=='a'
              ||c=='e'
              ||c=='i'
              ||c=='o'
              ||c=='u';
    }
}