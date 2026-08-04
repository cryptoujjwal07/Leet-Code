class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            min = Math.min(min , x);
            max = Math.max(max , x);

            set.add(x);
        }

        List<Integer> ll = new ArrayList<>();
        for(int i = min+1 ; i <= max ; i++){
            if(!set.contains(i)) ll.add(i);
        }
        return ll;
    }
}