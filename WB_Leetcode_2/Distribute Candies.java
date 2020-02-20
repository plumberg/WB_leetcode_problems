class Solution {
    public int distributeCandies(int[] candies) {
        
        HashSet<Integer>set = new HashSet<>();
        for(Integer i : candies){
            set.add(i);
        }
        int halfMax = candies.length/2;
        return set.size()<=halfMax?set.size():halfMax;
    }
}