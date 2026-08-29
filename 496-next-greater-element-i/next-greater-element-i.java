class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st= new Stack<>();
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[10001];
        for(int i=m-1;i>=0;i--){
            int num=nums2[i];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            ans[num]=st.isEmpty()?-1:st.peek();
            st.push(num);
        }
        for(int i=0;i<n;i++){
            nums1[i]=ans[nums1[i]];
        }
        return nums1;
    }
}