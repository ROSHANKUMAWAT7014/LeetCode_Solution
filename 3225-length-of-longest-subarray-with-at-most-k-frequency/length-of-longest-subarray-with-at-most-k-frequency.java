class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        int maxlen=0;
        int currlen=0;
        int left=0;
        Map<Integer,Integer> map =new HashMap<>();
        for(int right=0;right<arr.length;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.get(arr[right])>k){
                map.put(arr[left],map.get(arr[left])-1);
                left++;
            }
            currlen=right-left+1;
            maxlen=Math.max(maxlen,currlen);
        }
        return maxlen;
    }
}