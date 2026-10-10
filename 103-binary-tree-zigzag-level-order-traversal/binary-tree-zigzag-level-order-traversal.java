class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean check = true;
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> currLevel = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if(currNode.left !=null){
                    queue.offer(currNode.left);
                }
                if(currNode.right !=null){
                    queue.offer(currNode.right);
                }   
            }
            if(!check){
                Collections.reverse(currLevel);
                result.add(currLevel);
                check =true;
            }
            else{
                result.add(currLevel);
                check = false;
            }
        }
        return result;
    }
}
