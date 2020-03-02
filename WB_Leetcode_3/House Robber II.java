class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int [] arr1 = new int [nums.length];
        int [] arr2 = new int [nums.length];
        
        arr1[0] = nums[0];
        arr2[0] = 0;
        
        arr1[1] = Math.max(nums[0],nums[1]);
        arr2[1] = nums[1];
        
        for(int i=2;i<nums.length;i++){
            arr1[i] = Math.max(arr1[i-1], arr1[i-2]+nums[i]);
            arr2[i] = Math.max(arr2[i-1], arr2[i-2]+nums[i]);
        }
        return Math.max(arr1[nums.length-2], arr2[nums.length-1]);
    }
}