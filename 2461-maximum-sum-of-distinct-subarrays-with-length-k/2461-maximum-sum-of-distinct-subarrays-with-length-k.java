import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element to window
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // If window size becomes greater than k
            if (right - left + 1 > k) {

                sum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                // Remove from map if frequency becomes 0
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Window size is exactly k
            if (right - left + 1 == k) {

                // All elements are distinct
                if (map.size() == k) {
                    max = Math.max(max, sum);
                }
            }
        }

        return max;
    }
}