# LeetCode-Solutions
My solutions to LeetCode DSA problems with explanation in java

  import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // We need a pair: one number from the array and another to match the target.

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numMap.containsKey(complement)) {
                // get() is used to get the value stored for a specific key.
                return new int[]{numMap.get(complement), i};
            }

            // Otherwise, store the number with its index
            numMap.put(nums[i], i);
        }

        // Return null if no solution (not needed in LeetCode as a solution is guaranteed)
        return null;
    }
}
