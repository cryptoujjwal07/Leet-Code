class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ll = new ArrayList<>();
        double times = Math.pow(2,n);

        for(int i = 0 ; i < times;i++){
            ll.add(i^(i>>1));
        }
        return ll;
    }
}