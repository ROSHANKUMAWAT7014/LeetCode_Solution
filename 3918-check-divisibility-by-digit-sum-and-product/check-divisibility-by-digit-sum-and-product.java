class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int rem=0;
        int ans=n;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        int c=sum+product;
        if(ans%c==0){
            return true;
        }
        return false;
    }
}