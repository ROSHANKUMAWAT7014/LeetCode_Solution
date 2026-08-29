class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int target = nums1[i];
            int nextGreater = -1;

            // Step 1: Find the index of target in nums2
            int j = 0;
            while (j < m && nums2[j] != target) {
                j++;
            }

            // Step 2: Search to the right of target in nums2 for the first greater element
            for (int k = j + 1; k < m; k++) {
                if (nums2[k] > target) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            ans[i] = nextGreater;
        }

        return ans;
    }
}
