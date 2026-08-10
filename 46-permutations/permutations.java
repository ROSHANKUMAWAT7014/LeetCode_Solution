class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        helper(nums,0,result);
        return result;
    }
    public void helper(int[] nums,int idx,List<List<Integer>>result){
        if(idx == nums.length){
            List<Integer> list =new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            result.add(list);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            helper(nums,idx+1,result);
            swap(nums,idx,i);
        }
    }
   private  void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}