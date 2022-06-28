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
    public ListNode middleNode(ListNode head) {
        ListNode slowtemp=head;
        ListNode fasttemp=head;
        while(fasttemp!=null && fasttemp.next!=null ){
            slowtemp=slowtemp.next;
            fasttemp=fasttemp.next.next;
        }
        return slowtemp;
    }
}