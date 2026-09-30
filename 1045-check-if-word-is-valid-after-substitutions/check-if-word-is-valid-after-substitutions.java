class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();
        for(char ch:s.toCharArray()){
            st.push(ch);
            if(st.peek()=='c' && st.size()>=3){
               int n=st.size();
               if(st.get(n-2)=='b' && st.get(n-3)=='a'){
                st.pop();
                st.pop();
                st.pop();
               }
            }
        }
        return st.isEmpty();
    }
}