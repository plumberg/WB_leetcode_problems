class Solution {
    public int[] findErrorNums(int[] nums) {
     HashSet<Integer>set = new HashSet<>();
     int arr [] = new int[2];
        for(Integer i: nums){
            if(set.contains(i)) arr[0]=i;
            set.add(i);
        }
        
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) {
                arr[1]=i;
                return arr;
            }
        }
        return new int[0];
    }
        
    //TreeSet    
    /*  int arr [] = new int[2];
        TreeSet<Integer>set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                arr[0]=nums[i];
            }
            else set.add(nums[i]);
        }
        
        if(set.size()==nums.length) return new int[0];
        
        for(int i=1;i<nums.length;i++) {
        	if(set.size()==0) {
        		arr[1] = i;
        	}
        	else if(set.first()!=i) {
        		arr[1] = i;
        		break;
        	}
        	else set.remove(set.first());
        }
        
       
        return arr;
    }*/
}