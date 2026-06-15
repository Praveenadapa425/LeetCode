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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode t = dummyHead;
        ListNode r = dummyHead;
        while(r.next != null && r.next.next != null){
            t = t.next;
            r = r.next.next;                 
        }
        t.next = t.next.next;
        return dummyHead.next; 
    }
}