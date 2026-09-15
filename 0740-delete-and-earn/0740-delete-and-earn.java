class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int x : nums){
            max = Math.max(max, x);
        }
        int[] freq = new int[max + 1];
        for(int x : nums){
            freq[x]++;
        }
        int prev2 = 0;
        int prev1 = 0;
        for(int i = 1; i <= max; i++){
            int take = prev2 + i * freq[i];
            int skip = prev1;
            int curr = Math.max(take, skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}