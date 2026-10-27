class Solution {
    private boolean good(int x){
        boolean g = false;
        while(x > 0){
            int d = x % 10;
            if(d == 3 || d == 4 || d == 7)return false;
            if(d == 2 || d == 5 || d == 6 || d == 9) g = true;
            x /= 10;
        }
        return g;
    } 
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            if(good(i) == true)count++;
        }
        return count;
    }
}