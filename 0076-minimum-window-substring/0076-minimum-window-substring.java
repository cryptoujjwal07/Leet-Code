class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int l = 0;
        int st = 0;
        int count = t.length();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch] > 0)
                count--;

            freq[ch]--;

            while (count == 0) {

                if (i - l + 1 < min) {
                    min = i - l + 1;
                    st = l;
                }

                char leftChar = s.charAt(l);

                freq[leftChar]++;

                if (freq[leftChar] > 0)
                    count++;

                l++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(st, st + min);
    }
}