class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null) {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++) {
                TreeNode c=q.remove();
                sum+=c.val;
                if(c.left!=null) {
                    q.add(c.left);
                }
                if(c.right!=null) {
                    q.add(c.right);
                }
            }
            ans.add((double)sum/size);
        }
        return ans;
    }
}