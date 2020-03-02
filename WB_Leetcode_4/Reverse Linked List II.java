/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
       ListNode prev = null;
        ListNode curr = head;
        
        while(m>1){
            prev = curr;
            curr = curr.next;
            m--;n--;
        }
        
        ListNode conn = prev;
        ListNode tail = curr;
        
        while(n>0){
            ListNode nextNod = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNod;
            n--;
        }
        
        if(conn == null) head = prev;
        else conn.next = prev;
        tail.next = curr;
        
        return head;
    }
}