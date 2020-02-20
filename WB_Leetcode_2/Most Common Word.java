class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        	HashSet <String> bannedWords = new HashSet<>();
            for(String ban:banned)bannedWords.add(ban);
        
            
            int parLen = paragraph.length();
            if(Character.isLetter(paragraph.charAt(parLen-1))){
                paragraph +=".";
            }
            
            HashMap<String,Integer>map = new HashMap<>();
            char [] parChars = paragraph.toCharArray();
            int counter = 0;
            String maxWord = "";
         int begin =0,end=1;
        
        int firstLetterIdx =0;
        if(!Character.isLetter(parChars[firstLetterIdx])){
            while(firstLetterIdx<parLen){
                if(!Character.isLetter(parChars[firstLetterIdx])){
                    firstLetterIdx++;
                } else break;
            }
            paragraph = paragraph.substring(firstLetterIdx, parLen+1);
            parChars = paragraph.toCharArray();
        }
           
            
            while(begin<parLen){
                while(Character.isLetter(parChars[end])){
                    end++;
                }
                String currWord = paragraph.substring(begin,end).toLowerCase();
                if(!bannedWords.contains(currWord)){
                     int count =1;
                    if(map.containsKey(currWord)){
                    count = map.get(currWord)+1;
                    }
                    map.put(currWord, count);
                    
                    if(count>counter){
                        counter = count;
                        maxWord = currWord;
                    }
                }
                while(end<parLen&&!Character.isLetter(parChars[end])){
                    end++;
                }
                begin = end;
            }
        return maxWord;
            
            
	}
}