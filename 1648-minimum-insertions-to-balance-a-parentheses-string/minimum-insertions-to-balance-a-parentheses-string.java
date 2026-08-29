class Solution {
    public int minInsertions(String s) {
        int ans=0;
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                    if(st.isEmpty()){
                        ans++;
                    }
                    else{
                        st.pop();
                    }
                }
                else {
                    ans++;
                     if (!st.isEmpty()) {
                        st.pop();
                    } 
                    else {
                        ans++; 
                    }
                }
            }
        }
        ans+=st.size()*2;
        return ans;
    }
}