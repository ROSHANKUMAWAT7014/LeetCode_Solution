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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode node=root;
        TreeNode l=invertTree(node.left);
        TreeNode r= invertTree(node.right);
            TreeNode temp;
            temp=node.left;
            node.left=node.right;
            node.right=temp;

        return root;
    }
}