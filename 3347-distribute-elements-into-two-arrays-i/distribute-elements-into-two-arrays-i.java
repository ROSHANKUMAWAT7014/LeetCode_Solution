class Solution {
    public int[] resultArray(int[] nums) {
        int n =nums.length;
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        l1.add(nums[0]);
        l2.add(nums[1]);

        for(int i=2;i<n;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
        }
        int[] result = new int[n];
        int idx = 0;
        for (int num : l1) result[idx++] = num;
        for (int num : l2) result[idx++] = num;
        return result;
    }
}