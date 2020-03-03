class Solution {
    public int calPoints(String[] ops) {
        Stack <Integer>st = new Stack<>();
        for(String s : ops){
            switch(s){
                case "+":
                    int top = st.pop();
                    int newtop = top+st.peek();
                    st.push(top);
                    st.push(newtop);
                    break;
                case "C":
                    st.pop();
                    break;
                case "D":
                    int twice = 2*st.peek();
                    st.push(twice);
                    break;
                default:
                    st.push(Integer.valueOf(s));
                    break;
            }
        }
        
        int sum =0;
        for(int i:st){
            sum +=i;
        }
        
        return sum;
    }
}