class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for(int j=0;j<n-3;j++){
        if(j>0 && arr[j]==arr[j-1]) continue;
        for (int i = j+1; i < n - 2; i++) {
            if (i > j+1 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                long sum = (long)arr[j]+arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    list.add(Arrays.asList(arr[j],arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                    } else if (sum < target) {
                    left++;
                    } else {
                        right--;
                    }
                }
            }
       }
        return list;
    }
}