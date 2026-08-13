class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character, Character> mpST = new HashMap<>();
        HashMap<Character, Character> mpTS = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if (mpST.containsKey(a)) {
                if (mpST.get(a) != b) {
                return false;
                }
            } 
            else{
                mpST.put(a, b);
            }
            if (mpTS.containsKey(b)) {
                if (mpTS.get(b) != a) {
                return false;
                }
            } 
            else{
                mpTS.put(b,a);
            }
        }
        return true;
    }
}