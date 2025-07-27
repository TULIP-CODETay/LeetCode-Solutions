import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<nums.length;i++){
      int remaining=target-nums[i];
     
        if(map.containsKey(remaining)){
          return new int [] { map.get(remaining),i};
        }
        map.put(nums[i],i);
      }  
      return new int[] {};
    }
}

//see, what's happening is that we are iterating through each number. For each number, we subtract it from the target to get the remaining value. Then, we check if this remaining value already exists in the map. If it does, that means we’ve found the pair whose sum equals the target, and we return their indices. If it doesn’t, we store the current number along with its index in the map, so we can use it later if needed.

//Step 1: i = 0
//nums[i] = 2

//remaining = 9 - 2 = 7

//Does the map contain 7? ❌ No

//So, add this number and index to the map:

//map.put(2, 0); // map = {2: 0}

//Step 2: i = 1
//nums[i] = 7

//remaining = 9 - 7 = 2

//Does the map contain 2? ✅ Yes!

//We earlier stored 2 at index 0.

//So, we return:

//return new int[] { map.get(2), 1 };
// return [0, 1]
