class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        if (n != max + 1) {
            return false;
        }

        int[] freq = new int[max + 1];

        for (int num : nums) {
            freq[num]++;
        }

        if (freq[max] != 2) {
            return false;
        }

        for (int i = 1; i < max; i++) {
            if (freq[i] != 1) {
                return false;
            }
        }

        return true;
    }
}