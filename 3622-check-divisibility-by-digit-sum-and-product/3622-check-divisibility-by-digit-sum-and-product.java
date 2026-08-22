class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int dSum = 0;
        int dPro = 1;
        while( temp != 0){
            int rem = temp % 10;
            dSum += rem;
            dPro *= rem;
            temp /= 10;
        }
        if(n % (dSum + dPro) == 0)return true;
        else return false;
    }
}