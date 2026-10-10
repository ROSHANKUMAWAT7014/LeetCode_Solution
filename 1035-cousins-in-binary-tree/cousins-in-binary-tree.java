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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            boolean foundX = false;
            boolean foundY = false;
            for(int i=0;i<n;i++){
                TreeNode currNode = q.poll();
                if (currNode.left != null && currNode.right != null) {
                    if ((currNode.left.val == x && currNode.right.val == y) || 
                        (currNode.left.val == y && currNode.right.val == x)) {
                        return false; 
                    }
                }
                if(currNode.left!=null){
                    q.offer(currNode.left);
                    if(currNode.left.val == x) foundX=true;
                    if(currNode.left.val==y) foundY =true;
                }
                if(currNode.right !=null){
                    q.offer(currNode.right);
                    if (currNode.right.val == x) foundX = true;
                    if (currNode.right.val == y) foundY = true;
                }
            }
            if(foundX && foundY) return true;
            // if(foundX || foundY) return false;
        }
        return false;
    }
}