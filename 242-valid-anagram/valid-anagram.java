//Done by myself

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Integer> mp =new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        Map<Character,Integer> mp1 =new HashMap<>();
        for(int i=0;i<t.length();i++){
            mp1.put(t.charAt(i),mp1.getOrDefault(t.charAt(i),0)+1);
        }

        return mp.equals(mp1);
    }
}

//More Optimal way

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;
        
//         int[] count = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
        
//         for (int c : count) {
//             if (c != 0) return false;
//         }
//         return true;
//     }
// }