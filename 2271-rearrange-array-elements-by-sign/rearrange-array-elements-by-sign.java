class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                a.add(arr[i]);
            }
            else{
                b.add(arr[i]);
            }
        }
        ArrayList<Integer> c= new ArrayList<>();
        for(int i=0;i<n/2;i++){
            c.add(b.get(i));
            c.add(a.get(i));
        }
        int[] num =new int[n];
        for(int i=0;i<n;i++){
            num[i] = c.get(i);
        }
        return num;
    }
}