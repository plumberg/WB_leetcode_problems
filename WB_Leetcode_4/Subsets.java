class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        
        callMethod(0,nums,outerList,new ArrayList<Integer>());
        return outerList;
    }
    
    public void callMethod(int idx, int[]nums,List<List<Integer>> outerList, ArrayList<Integer>innerList){
        outerList.add(new ArrayList<Integer>(innerList));
        
        for(int i = idx;i<nums.length;i++){
            innerList.add(nums[i]);
            callMethod(i+1,nums,outerList,innerList);
            innerList.remove(innerList.size()-1);
        }
    }
}