class Solution {
    int[][][] dp;

    public int countSpecialNumbers(int n) {
        String s = String.valueOf(n);
        int len = s.length();

        dp = new int[len][1 << 10][2];

        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, -1);

        return solve(0, 0, 1, 0, s);
    }

    int solve(int pos, int mask, int tight, int started, String s) {
        if (pos == s.length()) {
            return started == 1 ? 1 : 0;
        }

        if (dp[pos][mask][tight] != -1 && started == 1)
            return dp[pos][mask][tight];

        int limit = tight == 1 ? s.charAt(pos) - '0' : 9;
        int ans = 0;

        for (int d = 0; d <= limit; d++) {
            int newTight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                ans += solve(pos + 1, mask, newTight, 0, s);
            } 
            else {
                if ((mask & (1 << d)) == 0) {
                    ans += solve(pos + 1, mask | (1 << d),
                                 newTight, 1, s);
                }
            }
        }

        if (started == 1)
            dp[pos][mask][tight] = ans;

        return ans;
    }
}