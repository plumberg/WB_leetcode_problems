class Solution {
    public int scoreOfParentheses(String S) {
        int counter =0;
        Stack<Integer>stack = new Stack<>();
        for(char c : S.toCharArray()){
            if(c == '('){
                stack.push(counter);
                counter = 0;
            }else{
                counter = stack.pop()+Math.max(counter*2, 1);
            }
        }
        
        return counter;
    }
}