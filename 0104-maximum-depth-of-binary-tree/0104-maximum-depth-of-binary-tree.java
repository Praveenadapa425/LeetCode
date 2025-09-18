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
    public int maxDepth(TreeNode root) {
        return maxDep(root,new int[1]);
    }
    public int maxDep(TreeNode node,int[] arr){
        if(node == null){
            return 0;
        }

        arr[0] =(Math.max(maxDep(node.left,arr) , maxDep(node.right,arr)))+1;
        return arr[0];
    }
}