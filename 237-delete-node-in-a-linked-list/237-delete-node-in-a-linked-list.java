/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // swapping the node val and next node val
        int tempval= node.next.val;
        node.next.val=node.val;
        node.val =tempval;
        //deleting next node val
        ListNode temp= node.next.next;
        node.next= node.next.next;
    }
}