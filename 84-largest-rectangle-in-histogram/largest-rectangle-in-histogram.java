class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<=n;i++){
            int ch=(i==n)?0:heights[i];
            while(!st.isEmpty() && ch<heights[st.peek()]){
                int h=heights[st.pop()];
                int w=(st.isEmpty())?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,h*w);
            }
            st.push(i);
        }
        return maxArea;
    }
}