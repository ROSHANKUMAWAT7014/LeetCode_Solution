class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        List<String> ans = Arrays.asList(words);
        Collections.reverse(ans);

        return String.join(" ", ans);
    }
}