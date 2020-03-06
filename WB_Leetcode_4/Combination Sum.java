class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>outerList = new ArrayList<List<Integer>>();
        
        callMethod(outerList, new ArrayList<Integer>(), candidates, target, 0);
        
        return outerList;
    }
    
    public void callMethod(List<List<Integer>>outerList, ArrayList<Integer>innerList,int[] candidates, int target, int idx ){
        if(target<0)return;
        if(target == 0) outerList.add(new ArrayList<Integer>(innerList)); // copied list added
        else{
            for(int i =idx; i< candidates.length;i++){
                innerList.add(candidates[i]);
                callMethod(outerList,innerList,candidates,target-candidates[i],i);
                innerList.remove(innerList.size()-1);
            }
        }
    }
}