class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum = 0;
        int maxPrefix = 0;  // max prefix sum seen so far (start at 0 for empty subarray)
        int minPrefix = 0;  // min prefix sum seen so far

        for (int num : nums) {
            prefixSum += num;
            maxPrefix = Math.max(maxPrefix, prefixSum);
            minPrefix = Math.min(minPrefix, prefixSum);
        }

        return maxPrefix - minPrefix;
    }
}