class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == nums[i - 1] + 1){
                currSum += nums[i];
            }
            else break;
        }
        int ans = currSum;
        while(true){
            boolean found = false;
            for(int i =0 ; i < n ;i++){
                if(nums[i] == ans){
                    found = true;
                    break;
                }
            }
            if(!found) return ans;
            ans++;
        }
    }
}