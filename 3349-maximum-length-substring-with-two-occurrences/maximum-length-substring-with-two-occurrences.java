class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> mp= new HashMap<>();
        int left=0;
        int len=0;
        int curr_len=0;
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            while(mp.get(s.charAt(i))>2){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                left++;
            }
            curr_len=i-left+1;
            len=Math.max(len,curr_len);
        }
        return len;
    }
}