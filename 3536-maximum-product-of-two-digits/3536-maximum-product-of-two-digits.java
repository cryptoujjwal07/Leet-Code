class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        while(n > 0){
            int rem = n % 10;
            ll.add(rem);
            n /= 10;
        }
        int maxPro = Integer.MIN_VALUE;
        for(int i = 0 ; i < ll.size()-1 ; i++){
            for(int j = i+1 ; j < ll.size() ; j++){
                int prod = ll.get(i) * ll.get(j);
                maxPro = Math.max(maxPro , prod);
            }
        }
        return maxPro;
    }
}