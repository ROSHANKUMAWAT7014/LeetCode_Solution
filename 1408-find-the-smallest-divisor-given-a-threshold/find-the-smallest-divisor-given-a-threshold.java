class Solution {
    public int smallestDivisor(int[] arr, int t) {
        Arrays.sort(arr);
        int n=arr.length;
        int end=arr[n-1];
        int st=1;
        int ans =end;
        while(st<=end){
            int sum=0;
            int mid =st+(end-st)/2;
            for(int j=0;j<n;j++){
                sum+=(arr[j] + mid - 1) / mid;
                }
            if(sum<=t){
                ans=mid;
                end=mid-1;
                }
            else{
                st =mid+1;
            }
        }
        return ans;
    }
}