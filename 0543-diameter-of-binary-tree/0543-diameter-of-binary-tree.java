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
    // private int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDia = new int[1];
        height(root,maxDia);
        return maxDia[0];
    }
    private int height(TreeNode node , int[] maxDia){
        if(node == null ) return 0;

        int lh = height(node.left,maxDia);
        int rh = height(node.right,maxDia);
        System.out.println(node.val+" "+lh+" "+rh);
        maxDia[0] = Math.max(maxDia[0] , lh+rh);
        return Math.max(lh,rh)+1;
    }
}