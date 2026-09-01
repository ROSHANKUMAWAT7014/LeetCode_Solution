class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return count;
            }
            count++;
        }
        return count;
    }
}