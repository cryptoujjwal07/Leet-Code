class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = 0;
        int minDis = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                ans = i;
                minDis = Math.min(minDis , Math.abs(ans - start));
            }
        }
        return minDis;
    }
}