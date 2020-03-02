/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       /* if(head == null || head.next == null) return head;
            ListNode nod = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            
        return nod;
    }*/
        
        ListNode prev = null;
        
        while(head!=null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        
        return prev;
    }
}