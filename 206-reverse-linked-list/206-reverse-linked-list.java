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
    ListNode headnode = null;
    public ListNode reverse(ListNode h){
        if(h == null || h.next == null ){
            headnode = h;
            return h;
        }
        reverse(h.next);
        h.next.next =  h;
        // h.next = null is important bcuz for lastnode next must be null right? so that is needed or else after reversing 1st node and 2nd node keep on pointinfg each one soo cycle forms
        h.next = null;
        // System.out.println("headnode val: "+headnode.val+"h val: "+h.val);
        return headnode;
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
}