class Solution {
    public int findGCD(int[] nums) {
        int mn = 1001;
        int mx = 0;
        int ans = 0;
        for(int i = 0 ; i <nums.length ; i++){
            mn = Math.min(mn , nums[i]);
            mx = Math.max(mx , nums[i]);
        }
        for(int i = 1 ; i <= mn ; i++){
            if(mn % i == 0 && mx % i == 0){
                ans = Math.max(ans , i);
            }
        }
        return ans;
    }
}