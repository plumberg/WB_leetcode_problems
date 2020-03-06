class Solution {
    public boolean canPartition(int[] nums) {
    int total =0;
        for(int i: nums){
            total +=i;
        }
        if(total%2!=0) return false;
        return callMethod(nums, 0,0,total, new HashMap<String, Boolean>());
    }
    
    public boolean callMethod(int[] nums, int idx, int sum, int total,HashMap<String,Boolean>map){
        String str = idx+""+sum;
		if(map.containsKey(str)) {
			return map.get(str);
		}
		if(sum * 2 == total) return true;
        if(sum>total/2||idx >= nums.length) return false;

		boolean bool =callMethod(nums,idx+1,sum,total,map)||callMethod(nums,idx+1,sum+nums[idx],total,map);
		map.put(str, bool);
		return bool;
    }

}