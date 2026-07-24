class Solution {
    public boolean findSubarrays(int[] nums) {
        int[] sumSA = new int[nums.length-1];
        for (int i = 0; i < nums.length - 1; i++) {
            sumSA[i] = nums[i] + nums[i + 1];
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x : sumSA){
            map.put(x , map.getOrDefault(x , 0) + 1);
        }
        for (int freq : map.values()) {
            if (freq >= 2) {
            return true;
            }
        }
        return false;
    }
}