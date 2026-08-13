class Solution {
    public int subarraySum(int[] arr, int k) {
        int prefixSum=0;
        int cnt=0;
        Map<Integer,Integer> mpp =new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            int remove =prefixSum-k;
            if(mpp.containsKey(remove)){
                cnt+=mpp.get(remove);
            }
            mpp.put(prefixSum,mpp.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }
}