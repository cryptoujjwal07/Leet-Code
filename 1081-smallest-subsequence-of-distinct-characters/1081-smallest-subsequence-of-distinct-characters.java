class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIdx = new int[26];
        boolean[] check = new boolean[26];
        for(int i = 0 ; i < s.length() ; i++){
            lastIdx[s.charAt(i) - 'a'] = i;
        }

        //create stack monotonic;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(check[ch - 'a']) continue;
            while(!st.isEmpty() && st.peek() > ch && lastIdx[st.peek() - 'a'] > i){
                check[st.pop() - 'a'] = false;

            }
            st.push(ch);
            check[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();

    }
}