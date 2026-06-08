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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode dtemp = dummyHead;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                ListNode t = new ListNode(temp.val);
                dtemp.next = t;
                dtemp = dtemp.next;
            }
            temp = temp.next;
        }temp = head;
        while(temp != null){
            if(temp.val >= x){
                ListNode t = new ListNode(temp.val);
                dtemp.next = t;
                dtemp = dtemp.next;   
            }
            temp = temp.next;
        }
        return dummyHead.next;
    }
}