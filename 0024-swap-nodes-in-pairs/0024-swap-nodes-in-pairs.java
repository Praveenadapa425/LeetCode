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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        temp.next = head;
        ListNode t1 = head;
        while(temp.next != null && t1.next != null){
            temp.next = t1.next;
            t1.next = t1.next.next;
            temp.next.next = t1;

            temp = temp.next.next;
            t1 = temp.next;
        }
       return dummyHead.next;
    }
}