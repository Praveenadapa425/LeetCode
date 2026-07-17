/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, new int[1],0);
    }
    private int dfs(TreeNode node ,int[] arr,int sum){
        if(node == null) return arr[0];
        if(node.left == null && node.right == null) {
            sum = sum *10 +node.val;
            arr[0] += sum;
            return arr[0];
        }
        sum = sum *10 +node.val;
        dfs(node.left , arr,sum);
        dfs(node.right , arr,sum);
        return arr[0];


    }
}