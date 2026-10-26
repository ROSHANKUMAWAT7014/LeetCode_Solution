class Solution {
    public TreeNode buildTree(int[] pre, int[] in) {
        Map<Integer, Integer> inmap = new HashMap<>();
        for(int i = 0; i < in.length; i++){
            inmap.put(in[i], i);
        }
        return build(pre, 0, pre.length - 1, in, 0, in.length - 1, inmap);
    }
    
    private TreeNode build(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd, Map<Integer, Integer> inmap){
        if(preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(pre[preStart]);

        int inRoot = inmap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = build(pre, preStart + 1, preStart + numsLeft, in, inStart, inRoot - 1, inmap);
                          
        root.right = build(pre, preStart + numsLeft + 1, preEnd, in, inRoot + 1, inEnd, inmap);    
        return root;   
    }
}