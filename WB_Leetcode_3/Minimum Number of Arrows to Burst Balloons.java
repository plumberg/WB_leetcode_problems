class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length <2) return points.length;
        
        Arrays.sort(points, (arg1, arg2) -> Integer.compare(arg1[1],arg2[1]));
        
        int counter = 1;
        int [] curr = points[0];
        
        for(int[] point : points){
            int currEnd = curr[1];
            int nextStart = point[0];
           
            if(currEnd >=nextStart){
                continue;
            }else{
                curr = point;
                counter++;
            }
            
            
        }
        return counter;
    }
}