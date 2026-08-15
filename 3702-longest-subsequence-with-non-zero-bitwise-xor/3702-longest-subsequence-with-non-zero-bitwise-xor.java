class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int t = 0;
        boolean isHai = false;
        for(int x : nums){
            isHai |= x > 0;
            t ^= x;
        }
        if(t != 0)return n;
        if(isHai)return n-1;
        return 0;
    }
}