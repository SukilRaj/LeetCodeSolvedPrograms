class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0, test=0;
        int row = mat.length;
        int col = mat[0].length;

        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    continue;
                }
                test = 1;
                for(int k = 0;k<row;k++){
                    if(k!=i && mat[k][j]==1){
                        test = 0;
                        break;
                    }
                }
                for(int c = 0;c<col;c++){
                    if(c!=j && mat[i][c]==1){
                        test = 0;
                        break;
                    }
                }
                if(test==1) ans++;
            }
        }
        return ans;
    }
}