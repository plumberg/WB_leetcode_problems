class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int [] children = g;
        int [] cookies = s;
        int counter =0;
        int childIdx = 0;
        Arrays.sort(children);
        Arrays.sort(cookies);
        for(int i=0;i<cookies.length&&
                    childIdx<children.length; i++){
            if(children[childIdx]<=cookies[i]){
                childIdx++;
                counter++;
            }
        }
        return counter;
    }
}