class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() == 0 && needle.length() == 0 ){
            return 0;
        }

        if(needle.length() == 0){
            return 0;
        }

        if(haystack.length() == 0){
            return -1;
        }

        int position = -1;
        String result = "";

        if(haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                result = findSubString(haystack, i, needle.length());
                if(result.equals(needle)){
                    position = i;
                    break;
                }
            }
        }

        return position;
    }

    /**
     * Method to splice a string at a certain length
     * @param input the string to modify
     * @param n the index of the first letter
     * @param length the length of the new string
     * @return spliced string
     */
    public String findSubString(String input, int n, int length){
        StringBuilder result = new StringBuilder();
        for(int i = n; i < length+n; i++){
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}