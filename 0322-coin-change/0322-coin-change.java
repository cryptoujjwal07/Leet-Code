class Solution {
    public int coinChange(int[] coins, int am) {
        int[] dp = new int[am + 1];
        Arrays.fill(dp, am + 1);
        dp[0] = 0;
        for(int c : coins){
            for(int i = c; i <= am; i++){
                dp[i] = Math.min(dp[i], dp[i - c] + 1);
            }
        }
        if (dp[am] == am+1) {
            return -1;
        }
        return dp[am];
    }
}