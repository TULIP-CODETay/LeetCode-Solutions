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

 //🔁 Loop from i = 1 to i = 9:
//i	  nums[i]   	nums[k-1]	    Action	           New nums	                     k
//1   	0	           0	Duplicate → skip	         [0,0,1,1,1,2,2,3,3,4]   	1
//2	   1	           0	New → nums[1] = 1	         [0,1,1,1,1,2,2,3,3,4]	    2
//3	   1	           1	Duplicate → skip	         [0,1,1,1,1,2,2,3,3,4]  	2
//4	   1	           1	Duplicate → skip	         [0,1,1,1,1,2,2,3,3,4]  	2
//5	   2	           1	New → nums[2] = 2	         [0,1,2,1,1,2,2,3,3,4]	    3
//6	   2	           2	Duplicate → skip	         [0,1,2,1,1,2,2,3,3,4]	    3
//7	   3	           2	New → nums[3] = 3	         [0,1,2,3,1,2,2,3,3,4]	    4
//8	   3	           3	Duplicate → skip	         [0,1,2,3,1,2,2,3,3,4]	    4
//9	   4	           3	New → nums[4] = 4	         [0,1,2,3,4,2,2,3,3,4]	    5
