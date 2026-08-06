class Solution {
    public int maxFrequency(int[] nums, int k) {
        // 1. Sort the array so we only increment numbers closest to our target
        Arrays.sort(nums);
        
        int st = 0;
        int max_c = 0;
        long windsum = 0; // Use long to prevent integer overflow
        
        // 2. Expand the window to the right
        for (int end = 0; end < nums.length; end++) {
            windsum += nums[end];
            
            // 3. Calculate operations needed for the current window
            // Target sum if all elements in window became nums[end]
            // We use (long) to ensure the multiplication doesn't overflow
            long operationsNeeded = (long) nums[end] * (end - st + 1) - windsum;
            
            // 4. If we need more than 'k' operations, shrink the window from the left
            while (operationsNeeded > k) {
                windsum -= nums[st];
                st++;
                // Recalculate operations needed after shrinking
                operationsNeeded = (long) nums[end] * (end - st + 1) - windsum;
            }
            
            // 5. Update the max frequency found so far
            max_c = Math.max(max_c, end - st + 1);
        }
        
        return max_c;
    }
}