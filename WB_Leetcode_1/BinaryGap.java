class Solution {
    public int binaryGap(int N) {
        if(N == 1 || N == 0) return 0;
        
        char [] nums = Integer.toBinaryString(N).toCharArray();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++){
            if(nums[i] =='1'){
                list.add(i);
            }
        }
        
        int max=0;
        for(int i=list.size()-1;i>0;i--){
        max = Math.max(max, list.get(i)-list.get(i-1));
        }
		return max;

    }
}