class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (arg1,arg2) -> Integer.compare(arg1[0],arg2[0]));
        ArrayList<int[]>list = new ArrayList<>(); //ArrayList because we don't know the size of output array
        int [] curr = intervals[0]; //lets take the first interval
        list.add(curr);
        
        //now, iterate over each intervals from the input
        for(int [] inter : intervals){
            //int currStart = curr[0];  -- we don't actually need it, but for debuging purposes left
            int currEnd = curr[1];
            int nextStart = inter[0];
            int nextEnd = inter[1];
            
            if(currEnd>=nextStart){
                curr[1] = Math.max(currEnd, nextEnd); // swap with biggest value
            }else{
                curr = inter;
                list.add(curr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}