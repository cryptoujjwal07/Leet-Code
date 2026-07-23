class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long tSum = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                tSum += grid[i][j];
            }
        }
        //horizontal cut
        long rSum = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                rSum += grid[i][j];
            }
            if(2 * rSum == tSum)return true;
        }
        //vertical cut
        long cSum = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                cSum += grid[j][i];
            }
            if(2 * cSum == tSum )return true;
        }
        return false;
    }
}