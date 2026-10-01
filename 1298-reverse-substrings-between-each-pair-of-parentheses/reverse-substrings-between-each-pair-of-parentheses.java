class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st =new Stack<>();
        Stack<Character> t1 =new Stack<>();
        Stack<Character> t2 =new Stack<>();
        StringBuilder  ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    t1.push(st.pop());
                }
                st.pop();
                while(!t1.isEmpty()){
                    t2.push(t1.pop());
                }
                while(!t2.isEmpty()){
                    st.push(t2.pop());
                }
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}