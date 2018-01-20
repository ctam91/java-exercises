import java.util.HashMap;

class Solution {
    /**
     * Given a string, return the first unique character
     * @param s the input string
     * @return the unique character
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(Character c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
            else{
                map.put(c, 2);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}