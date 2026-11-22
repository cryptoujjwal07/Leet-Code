class Solution {
    public boolean checkString(String s) {
        int n = s.length();

        for(int i = 0; i < n-1 ;i++){
            if(s.substring(i, i + 2).equals("ba"))return false;
        }
        return true;
    }
}