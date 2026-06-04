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
        if(head== null || head.next == null){
            return head;
        }
        ListNode second = head.next;
        head.next = swapPairs(second.next);
        second.next = head;
        return second;
    //     ListNode dummyHead = new ListNode(0);
    //     ListNode temp = dummyHead;
    //     temp.next = head;
    //     ListNode t1 = head;
    //     //  0    1   2  3
    //     //  temp t1
    //     while(temp.next != null && t1.next != null){
    //         temp.next = t1.next; //0 -->2
    //         t1.next = t1.next.next;//1-->3
    //         temp.next.next = t1;// 2 -->1

    //         temp = temp.next.next;
    //         t1 = temp.next;
    //     }
    //    return dummyHead.next;
    }
}