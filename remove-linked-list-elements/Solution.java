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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        prev.next = head;

        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
            }
            else{
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}