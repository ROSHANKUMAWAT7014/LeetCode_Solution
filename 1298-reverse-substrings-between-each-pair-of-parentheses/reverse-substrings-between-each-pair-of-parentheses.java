class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st =new Stack<>();
        
        StringBuilder  fans=new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(c==')'){
                StringBuilder  ans=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
                for(int i=0;i<ans.length();i++){
                    st.push(ans.charAt(i));
                }
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            fans.append(st.pop());
        }
        return fans.reverse().toString();
    }
}