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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int r = height(root.left , 0);
        int l = height(root.right , 0);
        if(Math.abs(r-l) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode root , int height){
        if(root == null) return height;
        height++;
        return Math.max(height(root.left,height),height(root.right , height));
    }
}