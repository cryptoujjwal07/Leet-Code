class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int g = gcd(nums[i], nums[j]);
                long strength = (1L * nums[i] * nums[j]) / (1L * g * g);
                max = Math.max(max, strength);
            }
        }
        return max;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}