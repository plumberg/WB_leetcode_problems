class LRUCache {
    HashMap<Integer,Node>map;
    Node tail = new Node();
    Node head = new Node();
    int capacity;
    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
        tail.prev = head;
        head.next = tail;
    }
    
    public int get(int key) {
        int out = -1;
        Node nod = map.get(key);
        if(nod!=null){
            out = nod.val;
            remove(nod);
            add(nod); //put it to the beginning after it was used 
        }
        return out;
    }
    
    public void put(int key, int value) {
        Node nod = map.get(key);
        if(nod!=null){ // replace nod with a new value, if it already exists
            remove(nod);
            nod.val = value;
            add(nod);
        }else{
            if(map.size()==capacity){ //if capacity is reached, remove the tail from map and LList
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNod = new Node();
            newNod.key = key;
            newNod.val = value;
            map.put(key, newNod);
            add(newNod);
        }
    }
    
    public void add(Node node){
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;        
    }
    
    public void remove(Node node){
        Node nextNod = node.next;
        Node prevNod = node.prev;
        prevNod.next = nextNod;
        nextNod.prev = node.prev;
    }
}
class Node{
    int val;
    int key;
    Node next;
    Node prev;
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */