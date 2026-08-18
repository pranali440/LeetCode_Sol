import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;
//[1,2,3,2,2]
        for (int right = 0; right < fruits.length; right++) {//0=1  1=2  2=3 ,3=2
        
           int currentCount;
                if (basket.containsKey(fruits[right])) {// false,false , true,
                    currentCount = basket.get(fruits[right]);   //
                } 
                else {
                    currentCount = 0;                           // 0,0
                }
            basket.put(fruits[right], currentCount + 1);  //([0],1) ([1],2)  ([2],3)

       
            while (basket.size() > 2) {//1>2=false, 2>2=false  3>2 =true
                int leftFruitCount = basket.get(fruits[left]);//
                if (leftFruitCount == 1) {
                    basket.remove(fruits[left]);   // 1=remove{2}
                } else {
                    basket.put(fruits[left], leftFruitCount - 1); // still present, just fewer
                }
                left++;
            }

            // Step 3: update the max window size found so far
            maxFruits = Math.max(maxFruits, right - left + 1);//(0,0-0+1=1) (1,1-0+1=2){2,2-1+1=2}
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