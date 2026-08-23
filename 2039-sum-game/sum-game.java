class Solution {
    public boolean sumGame(String num) {
        int mid = num.length() / 2;
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < mid; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = mid; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }
        return (2 * (leftSum - rightSum)) != (9 * (rightQ - leftQ));
    }
}