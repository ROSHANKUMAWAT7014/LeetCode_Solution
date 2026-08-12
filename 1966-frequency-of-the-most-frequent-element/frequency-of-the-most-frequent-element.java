class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int st = 0;
        int max_c = 0;
        long windsum = 0; 
        
        for (int end = 0; end < nums.length; end++) {
            windsum += nums[end];
            
            long operationsNeeded = (long) nums[end] * (end - st + 1) - windsum;
            
            while (operationsNeeded > k) {
                windsum -= nums[st];
                st++;
                operationsNeeded = (long) nums[end] * (end - st + 1) - windsum;
            }
            
            max_c = Math.max(max_c, end - st + 1);
        }
        
        return max_c;
    }
}