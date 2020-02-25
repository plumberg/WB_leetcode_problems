class MyHashMap {
    ListNode[] nodes;
    /** Initialize your data structure here. */
    public MyHashMap() {
        nodes = new ListNode[1000];//or 1000000
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int idx = key % 1000;
        
        ListNode newNode = nodes[idx];
        if(newNode == null){
            newNode = new ListNode(key,value);
            nodes[idx] = newNode;
        }
        
        ListNode prevNode = null;
        
        while(newNode!=null){
            if(newNode.key == key){
                newNode.value = value;
                return;
            }
            prevNode = newNode;
            newNode = newNode.next;
        }
        
        prevNode.next = new ListNode(key,value);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int idx = key % 1000;
        ListNode newNode = nodes[idx];
        
        if(newNode == null) return -1;
        
        while(newNode!=null){
            if(newNode.key == key){
                return newNode.value;
            }
            newNode = newNode.next;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int idx = key % 1000;
        ListNode newNode = nodes[idx];
        ListNode prevNode = null;
        if(newNode == null) return;
        if(newNode.key == key) {
            nodes[idx] = newNode.next;
            return;
        }
        
        while(newNode!=null){
            if(newNode.key == key){
                prevNode.next = newNode.next;
                return;
            }
            prevNode = newNode;
            newNode = newNode.next;
        }
        
        
    }
}

class ListNode{
    int key;
    int value;
    ListNode next;
    
    public ListNode(int key, int value){
        this.key=key;
        this.value=value;
        next = null;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */