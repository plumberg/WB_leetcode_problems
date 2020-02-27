class Solution {
    public int search(int[] nums, int target) {
        int minIdx =0;
        int maxIdx = nums.length-1;
        
        while(minIdx<=maxIdx){
            int midIdx = (minIdx+maxIdx)/2;
            
            if(nums[midIdx] == target) return midIdx;
            
            if(nums[midIdx] > target)  maxIdx = midIdx-1;
            else if(nums[midIdx] < target) minIdx = midIdx+1;
        }
        
        return -1;
    }
}