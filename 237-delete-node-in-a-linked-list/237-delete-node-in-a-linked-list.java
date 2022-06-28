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
        // now we have access of prev node, current node, next node
        // remove link for node to be deleted. (node.next is node to be deleted after swapping)
        node.next= node.next.next;
    }
}
