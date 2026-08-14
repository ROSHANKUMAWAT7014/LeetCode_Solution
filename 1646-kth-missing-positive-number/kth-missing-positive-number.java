class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0; 
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int correctNo = mid + 1; 
            int mising = arr[mid] - correctNo; 
            
            if (mising >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return (end + 1) + k;
    }
}