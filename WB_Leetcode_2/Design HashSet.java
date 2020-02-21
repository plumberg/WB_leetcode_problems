class MyHashSet {
    private Integer []space;
   
    /** Initialize your data structure here. */
    public MyHashSet() {
        space = new Integer[1000000];
    }
    public int hashIt(int key){
        key %= space.length ;
        return key;
    }
    public void add(int key) {
        int idx = hashIt(key);
        if(space[idx]==null)space[idx]=key;
        else return;
    }
    
    public void remove(int key) {
        int idx = hashIt(key);
        if(space[idx]==null)return;
        else space[idx]=null;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int idx = hashIt(key);
        if(space[idx] != null) return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */