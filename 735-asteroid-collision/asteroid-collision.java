class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            boolean destroy=false;
            while(!st.isEmpty() && arr[i]<0 && st.peek()>0){
                int a=st.peek();
                int b=arr[i];
                if(Math.abs(b)>Math.abs(a)){
                    st.pop();
                }
                else if(Math.abs(b)<Math.abs(a)){
                    destroy=true;
                    break;
                }
                else{
                    st.pop();
                    destroy = true;
                    break;
                }
            }
            if(!destroy){
                st.push(arr[i]);
            } 
        }
        int[] ans = new int[st.size()];
        for(int j=ans.length-1;j>=0;j--){
            ans[j]=st.pop();
        }
        return ans;
    }
}