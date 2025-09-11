// Problem: Add Two Numbers
// Given two non-empty linked lists representing two non-negative integers, 
// add the two numbers and return the sum as a linked list.
// The digits are stored in reverse order, and each node contains a single digit.


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head to simplify handling of the result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;  // carry for 10 place's
        while (l1 != null || l2 != null || carry > 0) {
            int sum=carry; 
            // Add l1's value if available
            if (l1 != null) {
                sum += l1.val; 
                l1 = l1.next; 
            }
          
            // Add l2's value if available
            if (l2 != null) {
                sum += l2.val; 
                l2 = l2.next; 
            }
            
          // Update carry for next iteration
            carry=sum/10; 
            current.next=new ListNode(sum%10);
            current=current.next; 
            // System.out.println(sum);
        }

        return dummyHead.next; 
    }
}


/*
Time Complexity: O(max(m, n)) – where m and n are lengths of l1 and l2
Space Complexity: O(max(m, n)) – for the new linked list storing the result
*/
