class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int time = 0;
        int fOranges = 0;
        int[][] vis = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                    vis[i][j] = 2;
                } else if (grid[i][j] == 1) {
                    fOranges++;
                }
            }
        }

        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] d : dir) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < n &&
                        nc >= 0 && nc < m &&
                        grid[nr][nc] == 1 &&
                        vis[nr][nc] == 0) {

                        vis[nr][nc] = 2;
                        grid[nr][nc] = 2;
                        fOranges--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            if (!q.isEmpty()) {
                time++;
            }
        }

        return fOranges == 0 ? time : -1;
    }
}