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
    public void flatten(TreeNode root) {
        if(root==null) return;
        Queue<TreeNode> q= new LinkedList<>();
        preorder(root,q);
        root=q.poll();
        while(!q.isEmpty()){
            root.left=null;
            root.right=q.poll();
            root = root.right;
        }
    }
    private void preorder(TreeNode node,Queue q){
        if(node == null) return;

        q.offer(node);
        preorder(node.left,q);
        preorder(node.right,q);
    }
}