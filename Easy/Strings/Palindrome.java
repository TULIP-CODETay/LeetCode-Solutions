-By converting in String.

  class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        String numStr = Integer.toString(x);
        int left = 0, right = numStr.length() - 1;

        while (left < right) {// thi means the left indice which is 0< the right mosty indice which is for eg 4 the condition will remain true unless left>=right. 
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

-Without converting in String:
class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Negative numbers and numbers ending with 0 (but not 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Step 2: Reverse the second half of the number
        while (x > reversed) {
            int digit = x % 10;          // get the last digit
            reversed = reversed * 10 + digit; // build the reversed number
            x = x / 10;                  // remove the last digit
        }

        // Step 3: Check if original == reversed (for even digits)
        // OR x == reversed/10 (for odd digits)
        return x == reversed || x == reversed / 10;
    }
}


//Step	  x	        digit = x % 10	         reversed = reversed * 10 + digit
//1	     123      	  3	                        0 * 10 + 3 = 3
//2	     12	          2	                        3 * 10 + 2 = 32
//3	     1	          1	                        32 * 10 + 1 = 321
