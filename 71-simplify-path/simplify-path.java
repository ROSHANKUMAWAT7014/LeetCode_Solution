class Solution {
    public String simplifyPath(String path) {
        Stack<String> st =new Stack<>();
        String[] comp=path.split("/");

        for(String s:comp){
            if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(s.equals("") || s.equals(".")){
                continue;
            }
            else{
                st.push(s);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir : st) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}