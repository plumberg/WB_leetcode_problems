class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        callMethod(1,n,k,outerList,new ArrayList<Integer>());
        return outerList;
    }
    
    public void callMethod(int idx, int n , int k, List<List<Integer>> outerList,ArrayList<Integer> innerList){
        if(innerList.size()==k){
            outerList.add(new ArrayList<Integer>(innerList));
            return;
        }
        
        for(int i = idx; i<= n;i++){
            innerList.add(i);
            callMethod(i+1,n,k,outerList,innerList);
            innerList.remove(innerList.size()-1);
        }
    }
}