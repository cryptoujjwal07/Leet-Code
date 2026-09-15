class Solution {
    public int change(int am, int[] coins) {
        int[] dp = new int[am + 1];
        dp[0] = 1;
        for(int x : coins){
            for(int i = x ; i < am+1 ; i++){
                dp[i] += dp[i - x];
            }
        }
        return dp[am];
    }
}