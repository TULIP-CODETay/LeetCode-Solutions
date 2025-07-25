class Solution {
    public int romanToInt(String s) {
        int total=0;
        int preValue=0;
        for(int i=s.length()-1;i>=0;i--){// // If current value is less than previous value, subtract it (used in cases like IV, IX, etc.)
            int currentValue=getValue(s.charAt(i));//// Get the integer value of the current Roman character

            if(currentValue<preValue){//
                total-=currentValue;
            }else{
                total+=currentValue;
            }
            preValue=currentValue;
        }
        return total;
        
    }
     private int getValue(char c) {
        switch (c) {
            case 'I': return 1;      // 'I' = 1
            case 'V': return 5;      // 'V' = 5
            case 'X': return 10;     // 'X' = 10
            case 'L': return 50;     // 'L' = 50
            case 'C': return 100;    // 'C' = 100
            case 'D': return 500;    // 'D' = 500
            case 'M': return 1000;   // 'M' = 1000
            default: return 0;       // For invalid characters, return 0 (safety case)
        }
    }
}


   //  Example: s = "IX" (i.e., 9)
    //Loop runs right to left:

      //   i = 1 → s.charAt(1) = 'X' → currentValue = 10
          
        // prevValue = 0

       //   10 < 0? ❌ No → total += 10 → total = 10

         // prevValue = 10

     //  i = 0 → s.charAt(0) = 'I' → currentValue = 1

      //    prevValue = 10

       // < 10? ✅ Yes → total -= 1 → total = 10 - 1 = 9
