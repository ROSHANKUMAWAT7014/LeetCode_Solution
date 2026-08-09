class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length-1;
        int st=1;
        int end=piles[n];
        int ans =end;
        while(st<=end){
            long t=0;
            int mid= st+(end-st)/2;
            for(int i=0;i<=n;i++){
                t+=((long)piles[i]+mid-1)/mid;
            }
            if(t<=h){
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
