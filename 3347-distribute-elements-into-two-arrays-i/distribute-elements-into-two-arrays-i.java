class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        int[] result =new int[n];
        result[0]=nums[0];
        list.add(nums[1]);
        int j=0;
         for(int i=2;i<n;i++){
            if(result[j]>list.get(list.size()-1)){
                result[j+1]=nums[i];
                j++;
            }
            else{
                list.add(nums[i]);
            }
        }
        int k=0;
        for(int i=j+1;i<n;i++){
            result[i]=list.get(k);
            k++;
        }
        return result;
    }
}