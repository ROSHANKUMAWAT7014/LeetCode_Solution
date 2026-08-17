class Solution {
    public String longestCommonPrefix(String[] arr) {
        String ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int j = 0;

            while (j < ans.length() &&
                   j < arr[i].length() &&
                   ans.charAt(j) == arr[i].charAt(j)) {
                j++;
            }

            ans = ans.substring(0, j);

            if (ans.length() == 0) {
                return "";
            }
        }

        return ans;
    }
}