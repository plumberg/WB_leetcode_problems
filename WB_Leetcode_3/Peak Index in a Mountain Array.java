class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int min =0;
        int maxIdx = A.length-1;
        
        while(min<maxIdx){
            int mid = (min+maxIdx)/2;
            
            if(A[mid]> A[mid+1]){
                maxIdx = mid;
            }else{
                min = mid+1;
            }
        }
        
        return maxIdx;
    }
}