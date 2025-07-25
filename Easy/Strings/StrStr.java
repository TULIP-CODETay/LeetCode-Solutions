class Solution {
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m= needle.length(); 
        for(int i=0; i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){ //equals is used to check if two things have same content
                return i;// found at index i.
            }else if((haystack).equals(needle)){
                return 0;
            
            }
        }
        return -1;
        
    }
}
