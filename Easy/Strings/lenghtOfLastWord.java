class Solution {
    public int lengthOfLastWord(String s) {
    int lenght=0;
    int i=s.length()-1;// this is only for strings int i =s.length-1 is for arrays
    while(i>=0 && s.charAt(i)==' '){
        i--;
    }while(i>=0 && s.charAt(i)!=' '){
        lenght++;
        i--; //← this moves to the previous character
    }  

   return lenght;

    }
    }
