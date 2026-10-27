class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        StringBuilder topRow = new StringBuilder();

        for(int i=0;i<n;i++){
            topRow.append('.');
        }
        ans[0]=topRow.toString();

        for(int i=1;i<m;i++){
            StringBuilder row= new StringBuilder();
            for(int j=0;j<n-1;j++){
                row.append('#');
            }
            row.append('.');
            ans[i]=row.toString();
        }
        return ans;
    }
}