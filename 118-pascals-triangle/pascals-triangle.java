import java.util.*;
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j=1;j<=i;j++){
                if(j==0||j==i){
                    l.add(1);
                }
                else{
                    int sum = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    l.add(sum);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
