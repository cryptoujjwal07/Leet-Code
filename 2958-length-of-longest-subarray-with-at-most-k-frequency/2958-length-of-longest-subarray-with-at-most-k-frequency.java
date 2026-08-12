class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer , Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        int leftP = 0;
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);

            while(map.get(nums[i]) > k){
                map.put(nums[leftP] , map.get(nums[leftP]) - 1);
                leftP++;
            }
            maxLen = Math.max(maxLen , i - leftP + 1);
        }
        return maxLen;
    }
}