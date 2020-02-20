class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();
        while(n!=1){
            int sum = 0;
            int curr = n;
            while(curr!=0){
                sum +=(curr%10)*(curr%10);
                curr /=10;
            }
            if(set.contains(sum))return false;
            set.add(sum);
            n = sum;
        }
        
        return true;
    }
}