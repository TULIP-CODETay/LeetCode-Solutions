// using binary search
class Solution {
    public int mySqrt(int x) {
        if(x<=1 ){return x;} 
        int left=1;// ok so the logic behind this is that the sqrt of a number is always btw 1 and half of the number
        int right =x/2;
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
           long square=(long)mid*mid;
            if(square==x){
                return mid;

            }else if(square<x){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

       return result; 
    }
}

// if its not a perfect square then square!=x . and at that time we will resturn th closest sqrt which comes from return result.
