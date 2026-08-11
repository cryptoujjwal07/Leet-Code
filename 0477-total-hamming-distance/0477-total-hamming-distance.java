class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i + 1 ; j <n ; j++){
                sum += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return sum;
    }
}