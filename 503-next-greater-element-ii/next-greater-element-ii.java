class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans, -1);
        for(int i=2*n-1;i>=0;i--){
            int num=nums[i%n];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            if(i<n){
                ans[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(num);
        }
        return ans;
    }
}