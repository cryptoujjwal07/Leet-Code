class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '(' && open++ > 0)res += c;
            else if(c == ')' && open-- > 1)res += c;
        }
        return res;
    }
}