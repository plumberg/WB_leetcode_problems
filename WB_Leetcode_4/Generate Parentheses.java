class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list = new ArrayList<>();
        callMethod(list,n,0,0,"");
        return list;
    }
    
    public void callMethod(List<String>list, int max, int start, int end, String str){
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(start<max){
            callMethod(list,max,start+1,end,str+"(");
        }
        if(end<start){
            callMethod(list,max,start,end+1,str+")");
        }
    }
}