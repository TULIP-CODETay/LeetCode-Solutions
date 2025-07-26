class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits [i]++; // it add 1 if the condition is true
               return digits;   

            }
            digits[i]=0;
        }
        int [] newNumber=new int[n+1];
        newNumber[0]=1;
        return newNumber;
    }
}

    //  Step	i	  digits[i]	         Action Taken	               Array After
     // 1   	2	  9	               9 → 0 (carry 1 left)	             [2, 9, 0]
     // 2   	1	  9	               9 → 0 (carry 1 left)	             [2, 0, 0]
     // 3  	0	  2	               2 + 1 → 3 (no more carry)	     [3, 0, 0] ✅ DONE

