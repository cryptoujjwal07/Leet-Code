class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ll = new ArrayList<>();
        ArrayList<Integer> ll2 = new ArrayList<>();

        int[] ans = new int[n];

        ll.add(nums[0]);
        ll2.add(nums[1]);

        for(int i = 2 ; i < n ;i++){
            if(ll.get(ll.size() - 1) > ll2.get(ll2.size() -1)){
                ll.add(nums[i]);
            }
            else{
                ll2.add(nums[i]);
            }
        }
        int k = 0;
        for(int x : ll){
            ans[k++] = x;
        }
        for(int x : ll2){
            ans[k++] = x;
        }
        return ans;
    }
}