class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            pq.add(entry.getKey());
        }
        
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(pq.poll());
        }
        
        return list;
        
    }
}