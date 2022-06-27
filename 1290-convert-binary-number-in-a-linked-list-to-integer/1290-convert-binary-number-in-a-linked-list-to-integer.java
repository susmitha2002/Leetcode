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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        temp=head;
        size = size-1;
        System.out.println(size);
        int value=0;
        while(temp!=null){
            value= (int) (value + (Math.pow(2,size) * (temp.val)));
            size--;
            System.out.println(value);
            temp=temp.next;
        }
        return value;
    }
}