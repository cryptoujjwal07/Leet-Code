class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        for(int x : nums){
            int sc = 0;
            for(int i = 0; i <= n - k; i++){
                boolean found = false;
                for(int j = i; j < i + k; j++){
                    if(nums[j] == x){
                        found = true;
                        break;
                    }
                }
                if(found){
                    sc++;
                }
            }
            if(sc == 1){
                ans = Math.max(ans, x);
            }
        }
        return ans;
    }
}