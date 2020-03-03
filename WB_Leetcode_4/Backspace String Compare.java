class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(!stack1.isEmpty() && c == '#'){
                stack1.pop();
            }else if(c!='#') { 
            	stack1.push(c);
            }
        
        }
        
        for(int i=0;i<T.length();i++){
            char c = T.charAt(i);
            if(!stack2.isEmpty() && c == '#'){
                stack2.pop();
            }else if(c!='#') { 
            	stack2.push(c);
            }
        }
        
         while(!stack1.isEmpty()||!stack2.isEmpty()){
        	if(stack1.isEmpty() || stack2.isEmpty()) return false;
            char val1 = stack1.pop();
            char val2 = stack2.pop();
            
            if(val1 != val2) return false;
            
        }
        if(stack1.isEmpty()||stack2.isEmpty()) return true;
        return false;
        
      /*  String s1 = String.valueOf(stack1);
        String s2 = String.valueOf(stack2);
        
        return s1.equals(s2);*/
            
    }
}