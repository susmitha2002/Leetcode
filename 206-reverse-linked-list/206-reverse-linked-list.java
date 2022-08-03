/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode nextnode =  head.next;
        while(current != null){
            current.next = prev;
            prev= current;
            current = nextnode;
            if(nextnode !=null) nextnode = nextnode.next;
        }
        return prev;
        
    }
}