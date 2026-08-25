class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int temp = k;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == k) k+=temp;
        }
        return k;
    }
}