class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        int n=s.length();
        int m=t.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            }
            else{
                s1.push(s.charAt(i));
            }
        }
       for(int i=0;i<m;i++){
            if(t.charAt(i)=='#'){
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            }
            else{
                s2.push(t.charAt(i));
            }
        }
        return s1.equals(s2);
    }
}