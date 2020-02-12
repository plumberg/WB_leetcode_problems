class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
        if(checkNum(i)) list.add(i);
        }
        return list;
    }
    
    public boolean checkNum(int i){
        String str = String.valueOf(i);
        
        for(char c : str.toCharArray()){
            int num = Character.getNumericValue(c);
            if(num==0||i%num!=0) return false;
        }
        
        return true;
    }
}