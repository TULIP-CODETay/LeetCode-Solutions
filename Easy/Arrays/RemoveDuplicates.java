class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, return 0 (no unique elements)
        if (nums.length == 0) return 0;

        // Pointer to store position of the last unique element
        int k = 1;

        // Start from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            // If current number is not equal to the previous unique number
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];  // Copy it to the next position
                k++;                // Move k to next position
            }
        }
        return k;
    }
}

 //       Now loop runs:

   //     i = 1 → nums[1] = 1 → nums[1] == nums[0] → ❌ skip (duplicate)

     //   i = 2 → nums[2] = 2 → nums[2] != nums[0] → ✅ new number

      //  nums[1] = 2

     //   k = 2

    //    i = 3 → nums[3] = 2 → nums[3] == nums[1] → ❌ skip

      //   i = 4 → nums[4] = 3 → nums[4] != nums[1] → ✅ new number

     //   nums[2] = 3

     //    k = 3
