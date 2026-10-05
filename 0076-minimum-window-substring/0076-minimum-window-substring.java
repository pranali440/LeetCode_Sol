class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        if (n > m) return "";

        int[] need = new int[128];            // need[c] > 0 means we still need c
        for (char c : t.toCharArray()) need[c]++;

        int missing = n;                      // how many chars of t are still unmatched
        int left = 0, start = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < m; right++) {
            char c = s.charAt(right);
            if (need[c] > 0) missing--;       // this char was actually needed
            need[c]--;                        // goes negative for extras / chars not in t

            while (missing == 0) {            // window is valid, so try to shrink it
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char l = s.charAt(left);
                need[l]++;
                if (need[l] > 0) missing++;   // we just dropped a needed char, so window is invalid
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}