import java.util.*;
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int sum = a.get(i - 1).get(j - 1) + a.get(i - 1).get(j);
                    row.add(sum);
                }
            }
            a.add(row);
        }
        return a;
    }
}
