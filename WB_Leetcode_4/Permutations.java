class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        callMethod(nums, outerList, new ArrayList<Integer>());
        return outerList;
    }
    
    public void callMethod(int[]nums,List<List<Integer>> outerList, ArrayList<Integer>innerList){
        if(innerList.size()==nums.length){
            outerList.add(new ArrayList<Integer>(innerList));
        }else{
            for(int i=0;i<nums.length;i++){
                if(innerList.contains(nums[i])) continue;
                innerList.add(nums[i]);
                callMethod(nums,outerList,innerList);
                innerList.remove(innerList.size()-1);
            }
        }
    }
}