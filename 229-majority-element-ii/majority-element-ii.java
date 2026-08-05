class Solution {
    public List<Integer> majorityElement(int[] arr) {
        // int n=arr.length;
        // ArrayList<Integer> list =new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=i;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //             if(count>n/3 && !list.contains(arr[i])){
        //                 list.add(arr[i]);
        //             }
        //         }
        //     }
        // }
        // return list;
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<Integer> list =new ArrayList<>();
        int cand=0;
        int count =0;
        
        for (int num : arr){
            if( count ==0){
                cand =num;
            }
            if(cand == num){
                count++;
            }
            else{
                cand =num;
                count=1;
            }
            if(count>n/3 && !list.contains(cand)){
                list.add(cand);
            }
        }
        return list;
    }
}