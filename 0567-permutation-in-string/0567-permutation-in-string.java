class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == windowCount[i]) matches++;
        }

        int left = 0;
        for (int right = n; right < m; right++) {
            if (matches == 26) return true;

            int rChar = s2.charAt(right) - 'a';
            windowCount[rChar]++;
            if (windowCount[rChar] == s1Count[rChar]) {
                matches++;
            } else if (windowCount[rChar] == s1Count[rChar] + 1) {
                matches--;
            }

            
            int lChar = s2.charAt(left) - 'a';
            windowCount[lChar]--;
            if (windowCount[lChar] == s1Count[lChar]) {
                matches++;
            } else if (windowCount[lChar] == s1Count[lChar] - 1) {
                matches--;
            }
            left++;
        }

        return matches == 26;
    }
}