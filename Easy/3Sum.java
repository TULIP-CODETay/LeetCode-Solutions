import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return result;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {// here we are fixing the first number which is nums[i] we have taken nums.length-2 so have enough numbers to amke the triplets
            // Skip duplicate elements for i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate elements for left
                    while(left < right && nums[left] == nums[left+1]) left++;


                    // Skip duplicate elements for right
                    while(left < right && nums[right] == nums[right-1]) right--;
                    
                    left++;
                    right--;
                } 
                else if(sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
