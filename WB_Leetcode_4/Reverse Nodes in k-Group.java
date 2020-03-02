/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode nextNode=null;
        ListNode curr = head;
        int i=0;
        while(curr!=null && i<k){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            i++;
        }
        
        if(nextNode!=null){
            head.next = reverseKGroup(nextNode, k);
        }else if(i<k && i>0){
            return reverseKGroup(prev, i);
        }
        
        return prev;
        
    }
}