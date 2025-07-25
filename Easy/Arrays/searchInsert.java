class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;// moves right to left

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
        return low;// Target not found, return insert position
        
    }
}      // Start: low = 0, high = 3

    //    mid = 1, nums[1] = 3

        // 2 < 3 → move left → high = 0

         //mid = 0, nums[0] = 1

        //2 > 1 → move right → low = 1

        //Now:

        //low = 1, high = 0 → loop ends

         //return low → 1 (position where 2 should be inserted)

          //So result = 1
