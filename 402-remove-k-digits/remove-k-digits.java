class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        st.push(num.charAt(0));
        for(int i=1;i<num.length();i++){
            char c = num.charAt(i);
            while(!st.isEmpty() && st.peek()>c && k>0){
            st.pop();
            k--;
            }
            st.push(c); 
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length()==0? "0": sb.toString();
    }
}