class Solution {
    public int smallestNumber(int n, int t) {
       while(true){
        int a= n;
        int b=1;
        while(a>0){
            b*=(a%10);
            a= a/10;
        }
        if(b%t ==0){
            return n;
        }
        n++;
       }
    }
}