class Solution {
    public boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            // Skip duplicates when start, mid, and end are identical
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }

            // Left half is sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1; // Target is in the left sorted half
                } else {
                    start = mid + 1; // Target is in the right half
                }
            } 
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1; // Target is in the right sorted half
                } else {
                    end = mid - 1; // Target is in the left half
                }
            }
        }

        return false;
    }
}