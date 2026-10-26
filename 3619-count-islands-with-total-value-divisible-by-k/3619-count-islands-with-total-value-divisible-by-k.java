class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Deque<int[]> st = new ArrayDeque<>();

        for(int i = 0;i < n ;i++){
            for(int j= 0; j < m ; j++){
                if(grid[i][j] == 0)continue;

                long sum =0;
                st.push(new int[]{i,j});

                sum += grid[i][j];
                grid[i][j] = 0;

                while(!st.isEmpty()){
                    int[] box = st.pop();

                    int r = box[0];
                    int c = box[1];

                    for(int d = 0;d < 4 ; d++){
                        int nr = r+dr[d];
                        int nc = c+dc[d];

                        if(nr>=0 && nr<n && nc >= 0 && nc <m && grid[nr][nc] > 0){
                            sum += grid[nr][nc];
                            grid[nr][nc] = 0;
                            st.push(new int[]{nr,nc});
                        }
                    }
                }

                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}