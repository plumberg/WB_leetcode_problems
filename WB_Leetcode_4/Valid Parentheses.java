class Solution {
    public boolean isValid(String s) {
        char [] pars = s.toCharArray();
        Stack<Character>stack = new Stack<>();
        for(char c : pars){
            if(c == '{' || c == '['||c=='('){
                stack.push(c);
            }
            else if(!stack.isEmpty()&&sameType(stack.peek(), c)){
                    stack.pop();
            } else return false;
        }
        
        return stack.isEmpty()?true:false;
        
    }
    
    public boolean sameType(char first, char second){        
        if(first =='{' && second == '}' ) return true;
        if(first =='[' && second == ']' ) return true;
        if(first =='(' && second == ')' ) return true;
        return false;
    }
}