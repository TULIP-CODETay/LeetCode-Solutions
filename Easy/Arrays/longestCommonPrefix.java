class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {//“While the current word (strs[i]) does NOT start with the prefix... keep doing something.”
                prefix = prefix.substring(0, prefix.length() - 1);//keep cutting the word from the right end until it matches the prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
