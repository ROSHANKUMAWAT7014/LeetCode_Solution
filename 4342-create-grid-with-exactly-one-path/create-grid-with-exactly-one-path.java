class Solution {
    public String[] createGrid(int m, int n) {
        char[][] ans = new char[m][n];
        for(int i=1;i<m;i++){
            Arrays.fill(ans[i],'#');
        }
        Arrays.fill(ans[0],'.');
        for(int i=1;i<m;i++){
            ans[i][n-1]='.';
        }
        String[] s= new String[m];
        for(int i=0;i<m;i++){
            s[i]=new String(ans[i]);
        }
        return s;
    }
}