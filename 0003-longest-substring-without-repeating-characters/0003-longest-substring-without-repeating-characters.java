class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];   // last index + 1 for each ASCII char
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(left, lastSeen[c]);   // move left past the previous occurrence
            lastSeen[c] = right + 1;              // store index + 1 (0 means "never seen")
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}