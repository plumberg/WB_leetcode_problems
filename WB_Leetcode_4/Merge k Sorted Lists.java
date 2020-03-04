/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(ListNode nod : lists){
            while(nod!=null){
                pq.add(nod.val);
                nod = nod.next;
            }
        }
        
        ListNode newNode = new ListNode(0);
        ListNode head = newNode;
        
        while(!pq.isEmpty()){
            head.next = new ListNode(pq.poll());
            head = head.next;
        }
        
        return newNode.next;
    }
}