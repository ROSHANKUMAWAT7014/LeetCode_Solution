import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Sort the array lexicographically
        Arrays.sort(strs);
        
        // Compare the first and last strings in the sorted array
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        int minLength = Math.min(first.length(), last.length());
        int i = 0;
        
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        
        return first.substring(0, i);
    }
}