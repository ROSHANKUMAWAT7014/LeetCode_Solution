class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int l = nums.length;
        int ans[] = new int[l];
        int posIndex = 0 , negIndex = 1;
        for (int i=0;i<l;i++)
        {
            if(nums[i] >= 0)
            {
                ans[posIndex] = nums[i];
                posIndex = posIndex + 2;
            }
            else if (nums[i] < 0)
            {
                ans[negIndex] = nums[i];
                negIndex = negIndex + 2;
            }
        } 
        return ans;
    }
}