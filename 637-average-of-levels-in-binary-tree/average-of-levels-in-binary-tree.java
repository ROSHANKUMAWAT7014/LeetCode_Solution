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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result =new ArrayList<>();
        
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            long sum =0;
            List<Integer> currLevel = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                sum+=currNode.val;
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            result.add((double)sum/n);
       }
        return result;
    }
}