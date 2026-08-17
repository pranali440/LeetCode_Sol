import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Step 1: add the fruit at 'right' into the basket
            int currentCount = basket.getOrDefault(fruits[right], 0);
            basket.put(fruits[right], currentCount + 1);

            // Step 2: if more than 2 distinct fruit types, shrink from the left
            while (basket.size() > 2) {
                int leftFruitCount = basket.get(fruits[left]);
                if (leftFruitCount == 1) {
                    basket.remove(fruits[left]);   // this fruit type is gone from window
                } else {
                    basket.put(fruits[left], leftFruitCount - 1); // still present, just fewer
                }
                left++;
            }

            // Step 3: update the max window size found so far
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    // quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] fruits = {1, 2, 1, 1, 3, 4, 2, 2, 2, 2, 4};
        System.out.println("Max fruits: " + sol.totalFruit(fruits));
    }
}