class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0 , r = n-1; 
        int ansP = n-1;
        while(l <= r){
            if(nums[l] * nums[l] > nums[r] * nums[r]){
                ans[ansP] = nums[l] * nums[l];
                l++;
            }
            else{
                ans[ansP] = nums[r] * nums[r];
                r--;
            }
            ansP--;
        }
        return ans;
    }
}