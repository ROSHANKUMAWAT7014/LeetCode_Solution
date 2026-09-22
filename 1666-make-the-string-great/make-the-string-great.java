class Solution {
    public String makeGood(String s) {
        Stack<Character> st= new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int a=(int)c;
            if(!st.isEmpty()){
                int b=(int)st.peek();
                if(a==b+32 || a==b-32){
                st.pop();
                }
                else{
                st.push(c);
                }
                }
            else{
                st.push(c);
            }
        }
        StringBuilder sb =new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}