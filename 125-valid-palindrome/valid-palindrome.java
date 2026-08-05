class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i); 
            if((ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                sb.append(ch);
            }
        }
        int l=0,r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}