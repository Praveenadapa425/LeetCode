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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root , 0 , ans);
        return ans;
    }
    private void level(TreeNode node , int l ,List<List<Integer>> ans){
        if(node == null) return ;

        if(ans.size() == l){
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            ans.add(list);
        }else{
            ans.get(l).add(node.val);
        }
        level(node.left,l+1,ans);
        level(node.right, l+1,ans);
    }
}