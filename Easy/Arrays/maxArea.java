//You are asked:

//"Choose any 2 poles, pour water between them, and build a giant tank using these two poles and the road."

//But:

//Water can only go as high as the shorter pole (if one is short, water will spill out from that side).

//The distance between poles is how wide the tank can be.


class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right =height.length-1;
        int max=0;
        while(left<right){
            int length =Math.min(height[left],height[right]);
            int breadth=right -left;
            int area=length * breadth;
            max=Math.max(area,max);
            if(height[left] < height[right]){
            left++;
            }else {
            right--;
        }
        }
 return max;
        
    }

}
