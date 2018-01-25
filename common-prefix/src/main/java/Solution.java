//["abc","ac" "ab", "abcd"] ---> a
// find that a is longest prefix
// 

//TODO #1: optimize code

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        String prefix = findPrefix(strs[0], strs[1]);
        String longestCommonPrefix = prefix;

        for(int i = 1; i < strs.length; i++){
            // find the prefix between index i and i+1 (start at 1 and 2)
            // if their common prefix is the same as before, result = prefix
            //if prefix is longer or shorter... 
            // if longer, make sure result stays as previous
            // if shorter or equal, make sure that result is the new prefix 
            prefix = findPrefix(strs[i-1],strs[i]);

            if(prefix.length()==0 || prefix == null){
                return "";
            }
            else{
                if(prefix.length() <= longestCommonPrefix.length()){
                    longestCommonPrefix = prefix;
                }
            }

        }
        return longestCommonPrefix;
    }

    //helper method to determine common prefix 
    public String findPrefix(String one, String two){
        StringBuilder prefix = new StringBuilder();
        int length = Math.min(one.length(), two.length());
        for(int i = 0; i < length; i++){
            if(one.charAt(i) == two.charAt(i)){
                prefix.append(one.charAt(i));
            }
            else{
                break;
            }
        }
        return prefix.toString();
    }
}