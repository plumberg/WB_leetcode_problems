class Solution {
    public int[] sortArrayByParity(int[] A) {
         int [] arr = new int [A.length];
         int counter =0; 
	       for(int i=0;i<A.length;i++){
               if(A[i]%2==0){
                   arr[counter] = A[i];
                   counter++;
               }
           }
           for(int i=0;i<A.length;i++){
               if(A[i]%2==1){
                   arr[counter] = A[i];
                   counter++;
               }
           }
	        return arr;
    }
}