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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head ;
        List<Integer> list = new ArrayList<>();

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();

        int max = 0;
        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && stack.peek() <= list.get(i)){
                stack.pop();
            }
            if(stack.empty()){
                arr[i] = 0;
            }else{
                arr[i] = stack.peek();
            }
            stack.push(list.get(i));
        }

       
        return arr;
    }
}