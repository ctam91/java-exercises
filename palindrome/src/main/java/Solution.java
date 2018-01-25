class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() == 0){
            return true;
        }

        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder result = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i --){
            result.append(s.charAt(i));
        }

        return s.equals(result.toString());
    }
}