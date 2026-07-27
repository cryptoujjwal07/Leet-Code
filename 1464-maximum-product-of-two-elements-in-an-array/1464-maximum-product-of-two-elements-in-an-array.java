class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int sum = (nums[i]-1) * (nums[j]-1);
                maxSum = Math.max(maxSum , sum);
            }
        }
        return maxSum;
    }
}