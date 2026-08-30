class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        int minIdx = 0;
        int maxIdx = 0;
        for(int num = 1; num < n; num++){
            if(nums[num] < min){
                min = nums[num];
                minIdx = num;
            }
            if(nums[num] > max){
                max = nums[num];
                maxIdx = num;
            }
        }
        int l = Math.max(minIdx, maxIdx) + 1;
        int r = n - Math.min(minIdx, maxIdx);
        int bt = Math.min(minIdx, maxIdx) + 1 + n - Math.max(minIdx, maxIdx);
        return Math.min(l, Math.min(r, bt));
    }
}