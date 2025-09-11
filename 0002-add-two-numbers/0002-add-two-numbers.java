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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // creating dummyhead
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;  // carry for 10 place's
        while (l1 != null || l2 != null || carry > 0) {
            int sum=carry; 
            // checking l1
            if (l1 != null) {
                sum += l1.val; 
                l1 = l1.next; 
            }
            //checking l2
            if (l2 != null) {
                sum += l2.val; 
                l2 = l2.next; 
            }
            // sum
            carry=sum/10; 
            current.next=new ListNode(sum%10);
            current=current.next; 
            System.out.println(sum);
        }

        return dummyHead.next; 
    }
}