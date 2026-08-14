class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt=0;
        int max=arr[arr.length-1];
        List<Integer> list =new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        for (int a = 1; a <=max; a++) {
            if (!list.contains(a)) {
                cnt++; 
            }
            if(cnt==k){
                return a;
            }
        }
        return max+k-cnt;
    }
}